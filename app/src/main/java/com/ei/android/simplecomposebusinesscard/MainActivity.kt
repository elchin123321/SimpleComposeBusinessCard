package com.ei.android.simplecomposebusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ei.android.simplecomposebusinesscard.ui.theme.SimpleComposeBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleComposeBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.blue_whale)
                ) {
                   MainPage()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    MainPage()
}

@Composable
fun MainPage(){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(bottom = 64.dp)){
            val image = painterResource(id = R.drawable.image_logo)
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = image, contentDescription = null, modifier = Modifier.padding(bottom = 8.dp))
                Text(
                    fontSize = 32.sp,
                    text = stringResource(R.string.my_name_text),
                    modifier = Modifier.padding(bottom = 8.dp),
                    color = Color.White,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = stringResource(R.string.android_developer_text),
                    modifier = Modifier.padding(bottom = 8.dp),
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.ufo_green)
                )

            }
        }
        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center) {
            Column(modifier = Modifier.padding(bottom = 32.dp)) {
                ContactRow(icon = Icons.Rounded.Call, text = stringResource(id = R.string.number_text))
                ContactRow(icon = Icons.Rounded.Share, text = stringResource(id = R.string.tg_text))
                ContactRow(icon = Icons.Rounded.Email, text = stringResource(id = R.string.email_text))
            }
        }

}
@Composable
fun ContactRow(icon: ImageVector, text:String){
    Divider(color = Color(0xE4E4E401))
    Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.padding(start = 64.dp,top = 8.dp, bottom = 8.dp)
    ){
        Icon(icon, contentDescription = null, tint = colorResource(id = R.color.ufo_green))
        Text(text = text,
            modifier = Modifier.padding(start = 16.dp),
            color = Color.White
        )
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun DefaultPreview() {
    SimpleComposeBusinessCardTheme {
        Greeting("Android")
    }
}