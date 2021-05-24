using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;
using DevExpress.UserSkins;
using DevExpress.Skins;
using System.Data;
using System.Data.SqlClient;

namespace CHUYENDE_CHUNGKHOAN
{
    static class Program
    {


        // tạo đối tượng kết nối Conn , kêt nối Database bằng mã lệnh
        public static SqlConnection conn = new SqlConnection();
        public static String connstr;
        public static SqlDataAdapter da=null;

        public static String servername = "VUONGDEV";
        public static String username = "sa";
        public static String password = "123";
        public static String database = "CHUNGKHOAN";
      



        public static int KetNoi()
        {
            if (Program.conn != null && Program.conn.State == ConnectionState.Open)
                Program.conn.Close();
            try
            {
                Program.connstr = "Data Source=" + Program.servername + ";Initial Catalog=" +
                      Program.database + ";User ID=" +
                      Program.username + ";password=" + Program.password;
                Program.conn.ConnectionString = Program.connstr;
                Program.conn.Open();
                return 1;
            }

            catch (Exception e)
            {
                MessageBox.Show("Lỗi kết nối cơ sở dữ liệu.\nBạn xem lại user name và password.\n " + e.Message, "", MessageBoxButtons.OK);
                return 0;
            }
        }

        //private void GetData()
        //{
        //    command.Notification = null;

        //    SqlDependency dependency = new SqlDependency(command);
        //    dependency.OnChange += dependency_OnChange;

        //    DataTable dt = new DataTable();
        //    dt.Load(command.ExecuteReader());
        //    this.gcBANGGIATRUCTUYEN.DataSource = dt;

        //If dataToWatch Is Nothing Then
        //dataToWatch = New DataSet()
        //End If
        //}

        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new frmMain());
        }
    }
}
