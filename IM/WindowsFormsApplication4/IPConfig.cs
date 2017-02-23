using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication4
{
    public partial class ipAddress : Form
    {
        public ipAddress()
        {
            InitializeComponent();
        }

        private string toIPAddress;
        private string friendName;
        private int portnum;
        private string yourName;

        public string gettoIPAddress()
        {
            return this.toIPAddress;
        }

        public string getfriendName()
        {
            return this.friendName;
        }

        public int getportNumber()
        {
            return portnum;
        }

        public string getyourName()
        {
            return yourName;
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void localIPAddressLable_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click_1(object sender, EventArgs e)
        {

        }

        private void ipAddress_Load(object sender, EventArgs e)
        {

        }

        private void portNumber_ValueChanged(object sender, EventArgs e)
        {
                   
        }

        private void updateIP_Click(object sender, EventArgs e)
        {
            friendName = ipNickname.Text;
            yourName = yourNickname.Text;
            toIPAddress = ipAdd.Text;
            portnum = Convert.ToInt32(portNumber.Value);
            Close();
        }

        private void ipNickname_TextChanged(object sender, EventArgs e)
        {

        }

        private void ipAdd_TextChanged(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void yourName_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }
    }
}
