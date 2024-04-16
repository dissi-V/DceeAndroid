package com.example.dcee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dcee.ui.theme.DceeTheme

class AssignActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assign()

        }
    }
}

@Composable
fun Assign(){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()))
    {
        Spacer(modifier = Modifier.height(30.dp))
    //Woof Text
        androidx.compose.material3.Text(
            text = "Woof",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            fontSize = 45.sp)
    //End of woof
    Spacer(modifier = Modifier.height(20.dp))

    //Beginning of card 0ne
    Card(modifier = Modifier
        .padding(start = 10.dp, end = 10.dp)
        .height(80.dp)
        .fillMaxWidth())
    {
        //Beginning of row stuff 1
        Row {
            //Image
            Box(modifier = Modifier.fillMaxWidth()){
                Image(painter = painterResource(id = R.drawable.dog1),
                    contentDescription = "dog1",
                    modifier = Modifier
                        .padding(start = 20.dp, top = 7.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                //Text
                Column {
                    androidx.compose.material3.Text(
                        text = "Koda",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier.padding(start = 110.dp, top = 10.dp))

                    androidx.compose.material3.Text(
                        text = "2 years old",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 110.dp))
                }
            }

        }

    }
        Spacer(modifier = Modifier.height(20.dp))
    //End of card 1


        //Beginning of card two
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {
            //Beginning of row stuff 1
            Row {
                //Image
                Box(modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.dog2),
                        contentDescription = "dog1",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    //Text
                    Column {
                        androidx.compose.material3.Text(
                            text = "Lola",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 110.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "16 years old",
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 110.dp))
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //End of card 2


        //Beginning of card three
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {
            //Beginning of row stuff 1
            Row {
                //Image
                Box(modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.dog1),
                        contentDescription = "dog1",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    //Text
                    Column {
                        androidx.compose.material3.Text(
                            text = "Frankie",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 110.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "2 years old",
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 110.dp))
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //End of card 3


        //Beginning of card four
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {
            //Beginning of row stuff 1
            Row {
                //Image
                Box(modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.dog1),
                        contentDescription = "dog1",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    //Text
                    Column {
                        androidx.compose.material3.Text(
                            text = "Nox",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 110.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "8 years old",
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 110.dp))
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //End of card 4


        //Beginning of card Five
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {
            //Beginning of row stuff 1
            Row {
                //Image
                Box(modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.dog1),
                        contentDescription = "dog1",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    //Text
                    Column {
                        androidx.compose.material3.Text(
                            text = "Faye",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 110.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "8 years old",
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 110.dp))
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //End of card 5


        //Beginning of card six
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {
            //Beginning of row stuff 1
            Row {
                //Image
                Box(modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.dog1),
                        contentDescription = "dog1",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    //Text
                    Column {
                        androidx.compose.material3.Text(
                            text = "Bella",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 110.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "14 years old",
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 110.dp))
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //End of card 6




    }


}

@Preview(showBackground = true)
@Composable
fun AssignPreview(){
    Assign()
}