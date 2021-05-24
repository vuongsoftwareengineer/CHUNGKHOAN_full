
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Security.Permissions;

namespace CHUYENDE_CHUNGKHOAN
{
    public partial class frmCHUNGKHOAN : DevExpress.XtraEditors.XtraForm
    {
        public frmCHUNGKHOAN()
        {
            InitializeComponent();
        }


        private const String tableName = "BANGGIATRUCTUYEN";
        private SqlConnection connection = null;
        private SqlCommand command = null;

        private void frmCHUNGKHOAN_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'dS.BANG_GIA_TRUC_TUYEN' table. You can move, or remove it, as needed.
            this.BANGGIATRUCTUYENTableAdapter.Fill(this.dS.BANGGIATRUCTUYEN);
            this.BANGGIATRUCTUYENTableAdapter.Connection.ConnectionString = Program.connstr;
            bgvBANGGIATRUCTUYEN.OptionsBehavior.ReadOnly = true;

            String ngay = lblNgay.Text;
            lblNgay.Text = DateTime.Now.ToString();
           
         

            cmbLoaiLenh.DisplayMember = "Text";
            cmbLoaiLenh.ValueMember = "Value";
            cmbLoaiLenh.Items.Add(new { Text = "LO", Value = "LO" });
            cmbLoaiLenh.SelectedIndex = 0;

            cmbLoaiGD.DisplayMember = "Text";
            cmbLoaiGD.ValueMember = "Value";
            cmbLoaiGD.Items.Add(new { Text = "M", Value = "M" });
            cmbLoaiGD.SelectedIndex = 0;

            cmbLoaiGD.DisplayMember = "Text";
            cmbLoaiGD.ValueMember = "Value";
            cmbLoaiGD.Items.Add(new { Text = "B", Value = "B" });
            cmbLoaiGD.SelectedIndex = 1;

            //Dependency
            if (CanRequestNotifications() == true)
                BatDau();
            else
                MessageBox.Show("Bạn chưa kích hoạt dịch vụ Broker", "", MessageBoxButtons.OK);

        }


        private void BatDau()
        {
            SqlDependency.Stop(GetConnectionString());
            try
            {
                SqlDependency.Start(GetConnectionString());
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "Xảy ra lỗi", MessageBoxButtons.OK);
                return;
            }
            if (connection == null)
            {
                connection = new SqlConnection(GetConnectionString());
                connection.Open();
            }

            if (command == null)
            {
                command = new SqlCommand(GetSQL(), connection);
                command.CommandType = CommandType.Text;
                command.CommandTimeout = 600;
            }

            command.Notification = null;

            SqlDependency dependency = new SqlDependency(command);
            dependency.OnChange += dependency_OnChange;

            DataTable dt = new DataTable();
            dt.Load(command.ExecuteReader());
            this.gcBANGGIATRUCTUYEN.DataSource = dt;
        }

        private string GetSQL()
        {
            return " SELECT MACP, GIAMUA_3, GIAMUA_KL3, GIAMUA_2, GIAMUA_KL2, GIAMUA_1, GIAMUA_KL1, KHOPLENH_GIA, "
                    + " KHOPLENH_KL, GIABAN_1, GIABAN_KL1, GIABAN_2, GIABAN_KL2, GIABAN_3, GIABAN_KL3" +
                    " FROM dbo.BANGGIATRUCTUYEN ";
        }

      
        private void dependency_OnChange(object sender, SqlNotificationEventArgs e)
        {
            ISynchronizeInvoke i = (ISynchronizeInvoke)this;

            if (i.InvokeRequired)
            {
                OnChangeEventHandler tempDelegate = new OnChangeEventHandler(dependency_OnChange);

                object[] args = new[] { sender, e };

                i.BeginInvoke(tempDelegate, args);

                return;
            }
            SqlDependency dependency = (SqlDependency)sender;
            dependency.OnChange -= dependency_OnChange;
            command.Notification = null;

            SqlDependency dependency1 = new SqlDependency(command);
            dependency1.OnChange += dependency_OnChange;

            DataTable dt = new DataTable();
            dt.Load(command.ExecuteReader());
            this.gcBANGGIATRUCTUYEN.DataSource = dt;
        }

        private string GetConnectionString()
        {
            return @"Data Source=VUONGDEV; Initial Catalog=CHUNGKHOAN;User ID=sa;Password=123";
        }

        private bool CanRequestNotifications()
        {
            try
            {
                SqlClientPermission perm = new SqlClientPermission(PermissionState.Unrestricted);
                perm.Demand();
                return true;
            }
            catch (Exception)
            {
                return false;
            }
        }

        private void btnMua_Click(object sender, EventArgs e)
        {

            if (txtMACP.Text == null)
            {
                MessageBox.Show("Bạn chưa nhập mã cố phiếu !", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }


            if (spiSoLuong.Text.ToString().Length == 0 || spiSoLuong.Value<=0)
            {
                MessageBox.Show("Số lượng cần lớn hơn 0 !", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }

            if (spiGia.Text.ToString().Length == 0 || spiSoLuong.Value <= 0)
            {
                MessageBox.Show("Bạn chưa nhập giá !", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }

            if (cmbLoaiGD.SelectedIndex == 0)
            {
                using (SqlConnection con = new SqlConnection(GetConnectionString()))
                {
                    using (SqlCommand cmd = new SqlCommand("SP_KHOPLENH_LO", connection))
                    {

                        cmd.CommandType = CommandType.StoredProcedure;
                        //get value member from combobox
                        String ngay =lblNgay.Text;
                        lblNgay.Text = DateTime.Now.ToString();
                        cmd.Parameters.Add(new SqlParameter("@macp", txtMACP.Text.Trim()));
                        cmd.Parameters.Add(new SqlParameter("@Ngay",ngay.ToString()));
                        cmd.Parameters.Add(new SqlParameter("@LoaiGD", "M"));
                        cmd.Parameters.Add(new SqlParameter("@soluongMB", spiSoLuong.Value));
                        cmd.Parameters.Add(new SqlParameter("@giadatMB", spiGia.Value));

                        con.Open();
                        cmd.ExecuteNonQuery();


                    }
                }

                MessageBox.Show("Thêm đặt lệnh thành công", "", MessageBoxButtons.OK);

            }
            if (cmbLoaiGD.SelectedIndex == 1)
            {
                using (SqlConnection con = new SqlConnection(GetConnectionString()))
                {
                    using (SqlCommand cmd = new SqlCommand("SP_KHOPLENH_LO", connection))
                    {
                        cmd.CommandType = CommandType.StoredProcedure;
                        

                        DateTime time = DateTime.Now;
                        string format = "dd/MM/yyyy HH:mm:ss.mmm";

                        cmd.Parameters.Add(new SqlParameter("@macp", txtMACP.Text.Trim()));
                        cmd.Parameters.Add(new SqlParameter("@Ngay", time.ToString(format)));
                        cmd.Parameters.Add(new SqlParameter("@LoaiGD", "B"));
                        cmd.Parameters.Add(new SqlParameter("@soluongMB", spiSoLuong.Value));
                        cmd.Parameters.Add(new SqlParameter("@giadatMB", spiGia.Value));

                        con.Open();
                        cmd.ExecuteNonQuery();


                    }
                }
                MessageBox.Show("Đặt lệnh thành công !", "", MessageBoxButtons.OK);

            }


            else
            {
              
                return;
            }
            }
        private void btnLamLai_Click(object sender, EventArgs e)
        {
            Reset();
           
        }

        private void Reset()
        {
            txtMACP.Text = "";
            spiSoLuong.Text = "0";
            spiGia.Text = "0";
        }

        private void txtMACP_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = !((e.KeyChar >= 65 && e.KeyChar <= 122) || (e.KeyChar == 8));
        }
    }

}
