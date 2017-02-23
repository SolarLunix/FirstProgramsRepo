namespace WindowsFormsApplication4
{
    partial class SolarLunixPMBox
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
            this.mBox = new System.Windows.Forms.ListBox();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.fileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.clearMessagesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.saveMessagesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.exitToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.connectionToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.createToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.viewLocalIPAddressItem = new System.Windows.Forms.ToolStripMenuItem();
            this.send = new System.Windows.Forms.Button();
            this.message = new System.Windows.Forms.TextBox();
            this.clearAllToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.clearMessageBoxOnlyToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // mBox
            // 
            this.mBox.BackColor = System.Drawing.SystemColors.Window;
            this.mBox.FormattingEnabled = true;
            this.mBox.Location = new System.Drawing.Point(11, 37);
            this.mBox.Name = "mBox";
            this.mBox.Size = new System.Drawing.Size(603, 433);
            this.mBox.TabIndex = 0;
            this.mBox.SelectedIndexChanged += new System.EventHandler(this.mBox_SelectedIndexChanged);
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.fileToolStripMenuItem,
            this.connectionToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(626, 24);
            this.menuStrip1.TabIndex = 1;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // fileToolStripMenuItem
            // 
            this.fileToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.clearMessagesToolStripMenuItem,
            this.saveMessagesToolStripMenuItem,
            this.exitToolStripMenuItem});
            this.fileToolStripMenuItem.Name = "fileToolStripMenuItem";
            this.fileToolStripMenuItem.Size = new System.Drawing.Size(37, 20);
            this.fileToolStripMenuItem.Text = "File";
            // 
            // clearMessagesToolStripMenuItem
            // 
            this.clearMessagesToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.clearAllToolStripMenuItem,
            this.clearMessageBoxOnlyToolStripMenuItem});
            this.clearMessagesToolStripMenuItem.Name = "clearMessagesToolStripMenuItem";
            this.clearMessagesToolStripMenuItem.Size = new System.Drawing.Size(155, 22);
            this.clearMessagesToolStripMenuItem.Text = "Clear Messages";
            // 
            // saveMessagesToolStripMenuItem
            // 
            this.saveMessagesToolStripMenuItem.Name = "saveMessagesToolStripMenuItem";
            this.saveMessagesToolStripMenuItem.Size = new System.Drawing.Size(155, 22);
            this.saveMessagesToolStripMenuItem.Text = "Save Messages";
            this.saveMessagesToolStripMenuItem.Click += new System.EventHandler(this.saveMessagesToolStripMenuItem_Click);
            // 
            // exitToolStripMenuItem
            // 
            this.exitToolStripMenuItem.Name = "exitToolStripMenuItem";
            this.exitToolStripMenuItem.Size = new System.Drawing.Size(155, 22);
            this.exitToolStripMenuItem.Text = "Exit";
            // 
            // connectionToolStripMenuItem
            // 
            this.connectionToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.createToolStripMenuItem,
            this.viewLocalIPAddressItem});
            this.connectionToolStripMenuItem.Name = "connectionToolStripMenuItem";
            this.connectionToolStripMenuItem.Size = new System.Drawing.Size(81, 20);
            this.connectionToolStripMenuItem.Text = "Connection";
            // 
            // createToolStripMenuItem
            // 
            this.createToolStripMenuItem.Name = "createToolStripMenuItem";
            this.createToolStripMenuItem.Size = new System.Drawing.Size(182, 22);
            this.createToolStripMenuItem.Text = "Create";
            this.createToolStripMenuItem.Click += new System.EventHandler(this.createToolStripMenuItem_Click);
            // 
            // viewLocalIPAddressItem
            // 
            this.viewLocalIPAddressItem.Name = "viewLocalIPAddressItem";
            this.viewLocalIPAddressItem.Size = new System.Drawing.Size(182, 22);
            this.viewLocalIPAddressItem.Text = "View local IPAddress";
            this.viewLocalIPAddressItem.TextImageRelation = System.Windows.Forms.TextImageRelation.Overlay;
            this.viewLocalIPAddressItem.Click += new System.EventHandler(this.viewLocalIPAddressToolStripMenuItem_Click);
            // 
            // send
            // 
            this.send.Location = new System.Drawing.Point(527, 476);
            this.send.Name = "send";
            this.send.Size = new System.Drawing.Size(87, 24);
            this.send.TabIndex = 2;
            this.send.Text = "Send";
            this.send.UseVisualStyleBackColor = true;
            this.send.Click += new System.EventHandler(this.send_Click);
            // 
            // message
            // 
            this.message.Location = new System.Drawing.Point(11, 479);
            this.message.Name = "message";
            this.message.Size = new System.Drawing.Size(510, 20);
            this.message.TabIndex = 3;
            this.message.TextChanged += new System.EventHandler(this.message_TextChanged);
            // 
            // clearAllToolStripMenuItem
            // 
            this.clearAllToolStripMenuItem.Name = "clearAllToolStripMenuItem";
            this.clearAllToolStripMenuItem.Size = new System.Drawing.Size(200, 22);
            this.clearAllToolStripMenuItem.Text = "Clear All";
            this.clearAllToolStripMenuItem.Click += new System.EventHandler(this.clearAllToolStripMenuItem_Click);
            // 
            // clearMessageBoxOnlyToolStripMenuItem
            // 
            this.clearMessageBoxOnlyToolStripMenuItem.Name = "clearMessageBoxOnlyToolStripMenuItem";
            this.clearMessageBoxOnlyToolStripMenuItem.Size = new System.Drawing.Size(200, 22);
            this.clearMessageBoxOnlyToolStripMenuItem.Text = "Clear Message Box Only";
            this.clearMessageBoxOnlyToolStripMenuItem.Click += new System.EventHandler(this.clearMessageBoxOnlyToolStripMenuItem_Click);
            // 
            // SolarLunixPMBox
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(626, 512);
            this.Controls.Add(this.message);
            this.Controls.Add(this.send);
            this.Controls.Add(this.mBox);
            this.Controls.Add(this.menuStrip1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "SolarLunixPMBox";
            this.Text = "SolarLunix\'s PM";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox mBox;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem fileToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem clearMessagesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem saveMessagesToolStripMenuItem;
        private System.Windows.Forms.Button send;
        private System.Windows.Forms.TextBox message;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem connectionToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem createToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem viewLocalIPAddressItem;
        private System.Windows.Forms.ToolStripMenuItem clearAllToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem clearMessageBoxOnlyToolStripMenuItem;
    }
}

