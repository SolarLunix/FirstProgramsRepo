using System;
using System.IO;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;

namespace WindowsFormsApplication4
{
    public partial class SolarLunixPMBox : Form
    {
        private int portNumber;
        private string ipAdd;
        private string friendName;
        private string yourName;
        private ArrayList messages;

        public SolarLunixPMBox()
        {
            this.yourName = "Me";
            InitializeComponent();
            this.messages = new ArrayList();
        }

        private void createToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ipAddress configure = new ipAddress();
            configure.ShowDialog();
            this.portNumber = configure.getportNumber();
            this.ipAdd = configure.gettoIPAddress();
            this.friendName = configure.getfriendName();
            this.yourName = configure.getyourName();

            string hold = "You are sending your messages to the IP Address: " + ipAdd + " over the port number " + portNumber.ToString() + " attempting to chat with " + friendName;
            mBox.Items.Add(hold);
            messages.Add(hold);

            /*
             * Send the above information to the other program and state:
             * yourName would like to chat with friendsname 
             * Would you like to chat?
             * Button: Yes, Button: No
             * 
             * Button Yes sends back the info under //Make this wait
             * 
             * Button No sends back friendName " is unable to chat right now."
             * 
             * Include timeout that says "No response received, please check that 
             * you have the correct IP address and the same Port Number.
             */ 

            //Make this wait 
            hold = "You are now connected with " + friendName;
            mBox.Items.Add(hold);
            messages.Add(hold);
        }

        private void mBox_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void viewLocalIPAddressToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LocalIP localbox = new LocalIP();
            localbox.ShowDialog();
        }

        private void message_TextChanged(object sender, EventArgs e)
        {

        }

        private void send_Click(object sender, EventArgs e)
        {
            string msg = message.Text;
            string hold = yourName + ": " + msg;
            messages.Add(hold);
            mBox.Items.Add(hold);
            message.Text = "";

            //Add a sending thingy here

        }

        private void saveMessagesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            using (StreamWriter sw = new StreamWriter(@"C:\Users\csf12mer\Desktop\SavedChat.txt", true))
            {
                foreach (string msg in messages)
                {
                    sw.WriteLine(msg);
                }
            }
            this.messages = new ArrayList();
            mBox.Items.Add(" - - - Messages Saved - - - ");
        }

        private void clearAllToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.messages = new ArrayList();
            mBox.Items.Clear();
        }

        private void clearMessageBoxOnlyToolStripMenuItem_Click(object sender, EventArgs e)
        {
            mBox.Items.Clear();
        }
    }
}
