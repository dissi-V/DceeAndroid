package com.example.dcee

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dcee.ui.theme.DceeTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column (modifier = Modifier
        .fillMaxSize()
        .fillMaxHeight()){

        val mContext = LocalContext.current

        //Topappbar
        TopAppBar(title = { Text(text = "Home"
        ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black


                    )
                }//End of top Topappbar

            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "Share",
                        tint = Color.Black)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "Share",
                        tint = Color.Black)

                }
            }



        )

        Spacer(modifier = Modifier.height(5.dp))

        androidx.compose.material3.Text(
            text ="Car Models",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.greengtr),
                contentDescription ="one",
                modifier = Modifier.size(width = 150.dp, height = 100.dp))


            Column {
                Text(
                    text = "Nissan GT-R",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold)
                Text(text = "Green", fontSize = 15.sp)
            }
        }
        //End of row


        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.seven),
                contentDescription ="one",
                modifier = Modifier.size(width = 150.dp, height = 100.dp))


            Column {
                Text(
                    text = "Mazda",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold)
                Text(text = "Black", fontSize = 15.sp)
            }
        }
        //End of row


        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.two),
                contentDescription ="one",
                modifier = Modifier.size(width = 150.dp, height = 100.dp))


            Column {
                Text(
                    text = "Bugatti Chiron",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold)
                Text(text = "Red", fontSize = 15.sp)
            }
        }
        //End of row


        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.eigt),
                contentDescription ="one",
                modifier = Modifier.size(width = 150.dp, height = 100.dp))


            Column {
                Text(
                    text = "Toyota Supra",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold)
                Text(text = "Black", fontSize = 15.sp)
            }
        }
        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Button(
                onClick = {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))
                },
                modifier = Modifier
                    .padding(horizontal = 30.dp,),
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Gray))
            {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrowback",
                    tint = Color.Black)
                Text(text = "Back")
            }

            Button(
                onClick = {
                    mContext.startActivity(Intent(mContext, IntentsActivity::class.java))
                },
                modifier = Modifier
                    .padding(),
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Gray))
            {
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "Arrowforward",
                    tint = Color.Black)
                Text(text = "Next")
            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}