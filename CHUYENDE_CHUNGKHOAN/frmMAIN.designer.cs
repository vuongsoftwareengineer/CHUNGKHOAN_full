namespace CHUYENDE_CHUNGKHOAN
{
    partial class frmMain
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmMain));
            this.ribbonControl1 = new DevExpress.XtraBars.Ribbon.RibbonControl();
            this.barBtn_BANGGIATRUCTUYEN = new DevExpress.XtraBars.BarButtonItem();
            this.barBtn_THOAT = new DevExpress.XtraBars.BarButtonItem();
            this.barBtn_GIAODICH = new DevExpress.XtraBars.BarButtonItem();
            this.ribbonPgQuanTri = new DevExpress.XtraBars.Ribbon.RibbonPage();
            this.ribbonPgGroupQuanTri = new DevExpress.XtraBars.Ribbon.RibbonPageGroup();
            this.fontDialog1 = new System.Windows.Forms.FontDialog();
            this.fontDialog2 = new System.Windows.Forms.FontDialog();
            this.ribbonPage5 = new DevExpress.XtraBars.Ribbon.RibbonPage();
            this.xtraTabbedMdiManager1 = new DevExpress.XtraTabbedMdi.XtraTabbedMdiManager(this.components);
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.ribbonPgGroupCauHinh = new DevExpress.XtraBars.Ribbon.RibbonPageGroup();
            this.ribbonPgCauHinh = new DevExpress.XtraBars.Ribbon.RibbonPage();
            ((System.ComponentModel.ISupportInitialize)(this.ribbonControl1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.xtraTabbedMdiManager1)).BeginInit();
            this.SuspendLayout();
            // 
            // ribbonControl1
            // 
            this.ribbonControl1.ExpandCollapseItem.Id = 0;
            this.ribbonControl1.Font = new System.Drawing.Font("Times New Roman", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ribbonControl1.Items.AddRange(new DevExpress.XtraBars.BarItem[] {
            this.ribbonControl1.ExpandCollapseItem,
            this.ribbonControl1.SearchEditItem,
            this.barBtn_BANGGIATRUCTUYEN,
            this.barBtn_THOAT,
            this.barBtn_GIAODICH});
            this.ribbonControl1.Location = new System.Drawing.Point(0, 0);
            this.ribbonControl1.Margin = new System.Windows.Forms.Padding(5);
            this.ribbonControl1.MaxItemId = 41;
            this.ribbonControl1.Name = "ribbonControl1";
            this.ribbonControl1.Pages.AddRange(new DevExpress.XtraBars.Ribbon.RibbonPage[] {
            this.ribbonPgQuanTri});
            this.ribbonControl1.Size = new System.Drawing.Size(1406, 209);
            // 
            // barBtn_BANGGIATRUCTUYEN
            // 
            this.barBtn_BANGGIATRUCTUYEN.Caption = "BẢNG ĐẶT LỆNH";
            this.barBtn_BANGGIATRUCTUYEN.Id = 14;
            this.barBtn_BANGGIATRUCTUYEN.ImageOptions.Image = ((System.Drawing.Image)(resources.GetObject("barBtn_BANGGIATRUCTUYEN.ImageOptions.Image")));
            this.barBtn_BANGGIATRUCTUYEN.ImageOptions.LargeImage = ((System.Drawing.Image)(resources.GetObject("barBtn_BANGGIATRUCTUYEN.ImageOptions.LargeImage")));
            this.barBtn_BANGGIATRUCTUYEN.LargeWidth = 75;
            this.barBtn_BANGGIATRUCTUYEN.Name = "barBtn_BANGGIATRUCTUYEN";
            this.barBtn_BANGGIATRUCTUYEN.RibbonStyle = ((DevExpress.XtraBars.Ribbon.RibbonItemStyles)((DevExpress.XtraBars.Ribbon.RibbonItemStyles.Large | DevExpress.XtraBars.Ribbon.RibbonItemStyles.SmallWithoutText)));
            this.barBtn_BANGGIATRUCTUYEN.SmallWithoutTextWidth = 100;
            this.barBtn_BANGGIATRUCTUYEN.SmallWithTextWidth = 100;
            this.barBtn_BANGGIATRUCTUYEN.ItemClick += new DevExpress.XtraBars.ItemClickEventHandler(this.barBtn_DATLENH_ItemClick);
            // 
            // barBtn_THOAT
            // 
            this.barBtn_THOAT.Caption = "THOÁT CHƯƠNG TRÌNH";
            this.barBtn_THOAT.Id = 27;
            this.barBtn_THOAT.ImageOptions.Image = ((System.Drawing.Image)(resources.GetObject("barBtn_THOAT.ImageOptions.Image")));
            this.barBtn_THOAT.ImageOptions.LargeImage = ((System.Drawing.Image)(resources.GetObject("barBtn_THOAT.ImageOptions.LargeImage")));
            this.barBtn_THOAT.Name = "barBtn_THOAT";
            this.barBtn_THOAT.RibbonStyle = ((DevExpress.XtraBars.Ribbon.RibbonItemStyles)((DevExpress.XtraBars.Ribbon.RibbonItemStyles.Large | DevExpress.XtraBars.Ribbon.RibbonItemStyles.SmallWithoutText)));
            this.barBtn_THOAT.ItemClick += new DevExpress.XtraBars.ItemClickEventHandler(this.barBtn_THOAT_ItemClick);
            // 
            // barBtn_GIAODICH
            // 
            this.barBtn_GIAODICH.Caption = "GIAO DỊCH CHỨNG KHOÁN";
            this.barBtn_GIAODICH.Id = 31;
            this.barBtn_GIAODICH.ImageOptions.Image = ((System.Drawing.Image)(resources.GetObject("barBtn_GIAODICH.ImageOptions.Image")));
            this.barBtn_GIAODICH.ImageOptions.LargeImage = ((System.Drawing.Image)(resources.GetObject("barBtn_GIAODICH.ImageOptions.LargeImage")));
            this.barBtn_GIAODICH.Name = "barBtn_GIAODICH";
            this.barBtn_GIAODICH.ItemClick += new DevExpress.XtraBars.ItemClickEventHandler(this.barBtnCHUNGKHOAN_ItemClick);
            // 
            // ribbonPgQuanTri
            // 
            this.ribbonPgQuanTri.Groups.AddRange(new DevExpress.XtraBars.Ribbon.RibbonPageGroup[] {
            this.ribbonPgGroupQuanTri});
            this.ribbonPgQuanTri.ImageOptions.Image = ((System.Drawing.Image)(resources.GetObject("ribbonPgQuanTri.ImageOptions.Image")));
            this.ribbonPgQuanTri.Name = "ribbonPgQuanTri";
            this.ribbonPgQuanTri.Text = "CHỨNG KHOÁN";
            // 
            // ribbonPgGroupQuanTri
            // 
            this.ribbonPgGroupQuanTri.ItemLinks.Add(this.barBtn_BANGGIATRUCTUYEN, true);
            this.ribbonPgGroupQuanTri.ItemLinks.Add(this.barBtn_GIAODICH);
            this.ribbonPgGroupQuanTri.ItemLinks.Add(this.barBtn_THOAT);
            this.ribbonPgGroupQuanTri.Name = "ribbonPgGroupQuanTri";
            this.ribbonPgGroupQuanTri.Text = "QUẢN LÍ CHỨNG KHOÁN";
            // 
            // ribbonPage5
            // 
            this.ribbonPage5.Name = "ribbonPage5";
            // 
            // xtraTabbedMdiManager1
            // 
            this.xtraTabbedMdiManager1.MdiParent = this;
            // 
            // statusStrip1
            // 
            this.statusStrip1.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.statusStrip1.Location = new System.Drawing.Point(0, 536);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Size = new System.Drawing.Size(1406, 22);
            this.statusStrip1.TabIndex = 1;
            // 
            // ribbonPgGroupCauHinh
            // 
            this.ribbonPgGroupCauHinh.Name = "ribbonPgGroupCauHinh";
            // 
            // ribbonPgCauHinh
            // 
            this.ribbonPgCauHinh.Name = "ribbonPgCauHinh";
            // 
            // frmMain
            // 
            this.AllowFormGlass = DevExpress.Utils.DefaultBoolean.True;
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1406, 558);
            this.Controls.Add(this.statusStrip1);
            this.Controls.Add(this.ribbonControl1);
            this.IconOptions.LargeImage = ((System.Drawing.Image)(resources.GetObject("frmMain.IconOptions.LargeImage")));
            this.IsMdiContainer = true;
            this.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Name = "frmMain";
            this.Ribbon = this.ribbonControl1;
            this.Text = "GIAO DỊCH CHỨNG KHOÁN";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.frmMAIN_Load);
            ((System.ComponentModel.ISupportInitialize)(this.ribbonControl1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.xtraTabbedMdiManager1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private DevExpress.XtraBars.Ribbon.RibbonControl ribbonControl1;
        private DevExpress.XtraBars.Ribbon.RibbonPage ribbonPgQuanTri;
        private System.Windows.Forms.FontDialog fontDialog1;
        private System.Windows.Forms.FontDialog fontDialog2;
        private DevExpress.XtraBars.Ribbon.RibbonPage ribbonPage5;
        private DevExpress.XtraBars.Ribbon.RibbonPageGroup ribbonPgGroupQuanTri;
        private DevExpress.XtraBars.BarButtonItem barBtn_BANGGIATRUCTUYEN;
       private DevExpress.XtraTabbedMdi.XtraTabbedMdiManager xtraTabbedMdiManager1;
        private System.Windows.Forms.StatusStrip statusStrip1;
       private DevExpress.XtraBars.BarButtonItem barBtn_THOAT;
        private DevExpress.XtraBars.Ribbon.RibbonPageGroup ribbonPgGroupCauHinh;
        private DevExpress.XtraBars.Ribbon.RibbonPage ribbonPgCauHinh;
       private DevExpress.XtraBars.BarButtonItem barBtn_GIAODICH;
    }
}

