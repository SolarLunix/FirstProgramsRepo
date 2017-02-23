namespace WindowsFormsApplication4
{
    partial class ipAddress
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(ipAddress));
            this.PortNumberLable = new System.Windows.Forms.Label();
            this.portNumber = new System.Windows.Forms.NumericUpDown();
            this.ipAddressLable = new System.Windows.Forms.Label();
            this.ipAdd = new System.Windows.Forms.TextBox();
            this.ipNickname = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.updateIP = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.yourNickname = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            ((System.ComponentModel.ISupportInitialize)(this.portNumber)).BeginInit();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // PortNumberLable
            // 
            this.PortNumberLable.AutoSize = true;
            this.PortNumberLable.Location = new System.Drawing.Point(9, 171);
            this.PortNumberLable.Name = "PortNumberLable";
            this.PortNumberLable.Size = new System.Drawing.Size(69, 13);
            this.PortNumberLable.TabIndex = 0;
            this.PortNumberLable.Text = "Port Number:";
            this.PortNumberLable.Click += new System.EventHandler(this.label1_Click);
            // 
            // portNumber
            // 
            this.portNumber.Location = new System.Drawing.Point(84, 169);
            this.portNumber.Maximum = new decimal(new int[] {
            49151,
            0,
            0,
            0});
            this.portNumber.Minimum = new decimal(new int[] {
            1024,
            0,
            0,
            0});
            this.portNumber.Name = "portNumber";
            this.portNumber.Size = new System.Drawing.Size(102, 20);
            this.portNumber.TabIndex = 1;
            this.portNumber.Value = new decimal(new int[] {
            1024,
            0,
            0,
            0});
            this.portNumber.ValueChanged += new System.EventHandler(this.portNumber_ValueChanged);
            // 
            // ipAddressLable
            // 
            this.ipAddressLable.AutoSize = true;
            this.ipAddressLable.Location = new System.Drawing.Point(17, 198);
            this.ipAddressLable.Name = "ipAddressLable";
            this.ipAddressLable.Size = new System.Drawing.Size(61, 13);
            this.ipAddressLable.TabIndex = 2;
            this.ipAddressLable.Text = "IP Address:";
            // 
            // ipAdd
            // 
            this.ipAdd.Location = new System.Drawing.Point(84, 195);
            this.ipAdd.Name = "ipAdd";
            this.ipAdd.Size = new System.Drawing.Size(101, 20);
            this.ipAdd.TabIndex = 3;
            this.ipAdd.TextChanged += new System.EventHandler(this.ipAdd_TextChanged);
            // 
            // ipNickname
            // 
            this.ipNickname.Location = new System.Drawing.Point(315, 194);
            this.ipNickname.Name = "ipNickname";
            this.ipNickname.Size = new System.Drawing.Size(100, 20);
            this.ipNickname.TabIndex = 4;
            this.ipNickname.TextChanged += new System.EventHandler(this.ipNickname_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(194, 197);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(114, 13);
            this.label1.TabIndex = 5;
            this.label1.Text = "Friend\'s Display Name:";
            this.label1.Click += new System.EventHandler(this.label1_Click_1);
            // 
            // updateIP
            // 
            this.updateIP.Location = new System.Drawing.Point(108, 221);
            this.updateIP.Name = "updateIP";
            this.updateIP.Size = new System.Drawing.Size(218, 34);
            this.updateIP.TabIndex = 6;
            this.updateIP.Text = "Update and Close";
            this.updateIP.UseVisualStyleBackColor = true;
            this.updateIP.Click += new System.EventHandler(this.updateIP_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(207, 171);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(100, 13);
            this.label2.TabIndex = 8;
            this.label2.Text = "Your Display Name:";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // yourNickname
            // 
            this.yourNickname.Location = new System.Drawing.Point(314, 168);
            this.yourNickname.Name = "yourNickname";
            this.yourNickname.Size = new System.Drawing.Size(101, 20);
            this.yourNickname.TabIndex = 7;
            this.yourNickname.TextChanged += new System.EventHandler(this.yourName_TextChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.ImageAlign = System.Drawing.ContentAlignment.BottomLeft;
            this.label3.Location = new System.Drawing.Point(5, 16);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(389, 130);
            this.label3.TabIndex = 9;
            this.label3.Text = resources.GetString("label3.Text");
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // groupBox1
            // 
            this.groupBox1.BackColor = System.Drawing.SystemColors.Info;
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(403, 150);
            this.groupBox1.TabIndex = 10;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Instructions";
            // 
            // ipAddress
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(429, 266);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.yourNickname);
            this.Controls.Add(this.updateIP);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.ipNickname);
            this.Controls.Add(this.ipAdd);
            this.Controls.Add(this.ipAddressLable);
            this.Controls.Add(this.portNumber);
            this.Controls.Add(this.PortNumberLable);
            this.Name = "ipAddress";
            this.Text = "Configuration ";
            this.Load += new System.EventHandler(this.ipAddress_Load);
            ((System.ComponentModel.ISupportInitialize)(this.portNumber)).EndInit();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label PortNumberLable;
        private System.Windows.Forms.NumericUpDown portNumber;
        private System.Windows.Forms.Label ipAddressLable;
        private System.Windows.Forms.TextBox ipAdd;
        private System.Windows.Forms.TextBox ipNickname;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button updateIP;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox yourNickname;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.GroupBox groupBox1;
    }
}