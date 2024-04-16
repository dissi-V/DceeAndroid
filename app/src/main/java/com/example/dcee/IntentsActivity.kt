package com.example.dcee

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.dcee.ui.theme.DceeTheme

class IntentsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIntents()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyIntents() {
    Column(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {

        val mContext = LocalContext.current

        //Topappbar
        TopAppBar(title = {
            Text(
                text = "Home"
            )
        },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black


                    )
                }//End of top Topappbar

            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share, contentDescription = "Share",
                        tint = Color.Black
                    )

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings, contentDescription = "Share",
                        tint = Color.Black
                    )

                }
            }


        )

        //STK
        OutlinedButton(onClick ={
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

        },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)) {
            Text(text = "M-pesa")

        }


        // Messages Button
        OutlinedButton(
            onClick = { val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0790138277".toUri()
                smsIntent.putExtra("sms_body","Hello Dcee,how was your day?")
                mContext.startActivity(smsIntent) },
            modifier = androidx.compose.ui.Modifier
                .height(60.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            Text(text = "Messages")
        }


        // Call Button
        OutlinedButton(
            onClick = {   val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0790138277".toUri()
                mContext.startActivity(callIntent)},
            modifier = androidx.compose.ui.Modifier
                .height(60.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            Text(text = "Call")
        }

        // Email Button
        OutlinedButton(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("dissiviscount25@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent) },
            modifier = androidx.compose.ui.Modifier
                .height(60.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            Text(text = "Email")
        }

        // Camera Button
        OutlinedButton(
            onClick = { /* TODO: Handle Camera button click */ },
            modifier = androidx.compose.ui.Modifier
                .height(60.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(width = 2.dp, color = Color.Blue)
        ) {
            Text(text = "Camera")


        }




    }
}

@Preview(showBackground = true)
@Composable
fun MyIntentsPreview(){
    MyIntents()
}