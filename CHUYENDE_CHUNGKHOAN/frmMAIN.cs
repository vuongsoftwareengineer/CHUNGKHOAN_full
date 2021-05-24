using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;


namespace CHUYENDE_CHUNGKHOAN
{
    public partial class frmMain : DevExpress.XtraBars.Ribbon.RibbonForm
    {
        public frmMain()
        {
            InitializeComponent();
        }

        //Kien tra form da load vao bo nho chua ?
        private Form CheckExists(Type ftype)
        {
            foreach (Form f in this.MdiChildren)
                if (f.GetType() == ftype)
                    return f;
            return null;
        }


        private void frmMAIN_Load(object sender, EventArgs e)
        {

            
        }

        private void barBtn_DATLENH_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {

        }

       
      
        private void barBtnCHUNGKHOAN_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            Form frm = this.CheckExists(typeof(frmCHUNGKHOAN));
            if (frm != null) frm.Activate();
            else
            {
                frmCHUNGKHOAN f = new frmCHUNGKHOAN();
                f.MdiParent = this;
                f.Show();
            }
        }

        private void barBtn_THOAT_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            DialogResult h = MessageBox.Show
               ("Bạn có chắc muốn thoát không?", "Thoát chương trình", MessageBoxButtons.OKCancel);
            if (h == DialogResult.OK)
                Application.Exit();
        }
    }
}
