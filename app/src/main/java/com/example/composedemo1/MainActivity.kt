package com.example.composedemo1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo1.ui.theme.ComposeDemo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
                    ){
                ButtonDemo()

            }
        }
    }

}

@Composable
fun ButtonDemo(){
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context,"Clicked on Button", Toast.LENGTH_SHORT).show()
    }) {
        Text("Add To cart")
    }

    Button(onClick = {
        Toast.makeText(context,"Clicked on Button", Toast.LENGTH_SHORT).show()
    },
        enabled = false
    ) {
        Text("Add To cart")
    }

    TextButton(onClick = {
        Toast.makeText(context,"Clicked on TextButton", Toast.LENGTH_SHORT).show()
    }) {
        Text("Add To cart")
    }
    OutlinedButton(onClick = {
        Toast.makeText(context,"Clicked on OutlineButton", Toast.LENGTH_SHORT).show()
    }) {
        Text("Add To cart")
    }
    
    IconButton(onClick = {
        Toast.makeText(context,
            "Clicked on Icon Button"
            ,
            Toast.LENGTH_SHORT
        ).show()

    }) {
       Icon(
           Icons.Filled.Refresh ,
           contentDescription = "Refersh Button",
       tint = Color.DarkGray,
           modifier = Modifier.size(80.dp))
    }

    Button(onClick = {
        Toast.makeText(context,"Clicked on Button", Toast.LENGTH_SHORT).show()
    },
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp,Color.Black),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.DarkGray,
            contentColor = Color.White

        )
    ) {
        Text("Add To cart",
        style = MaterialTheme.typography.h3,
        modifier = Modifier.padding(5.dp))
    }
}
