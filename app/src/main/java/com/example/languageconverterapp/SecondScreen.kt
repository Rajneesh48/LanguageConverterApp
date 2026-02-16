package com.example.languageconverterapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun SecondScreen(){
    Box(modifier = Modifier.fillMaxSize()
        .background(color = Color.Black),
        contentAlignment = Alignment.Center){
        Icon(painter = painterResource(R.drawable.vector_6),contentDescription = null,
            Modifier.background(color = Color.Gray))

    Column(modifier = Modifier.fillMaxWidth()
        .align(Alignment.BottomCenter).padding(10.dp)){
        Button(onClick = {},
            modifier = Modifier.fillMaxWidth()
                .padding(4.dp),
            contentPadding = PaddingValues(6.dp),
            shape = RoundedCornerShape(6.dp)
            , colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically){
                Icon(painter = painterResource(R.drawable.user), contentDescription = null
                    , Modifier.size(28.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Log in with Number",
                    color = Color.White,
                    fontSize = 16.sp,)

            }
        }


        Button(onClick = {},
            modifier = Modifier.fillMaxWidth()
                .padding(4.dp),
            contentPadding = PaddingValues(6.dp),
            shape = RoundedCornerShape(6.dp)
        , colors = ButtonDefaults.buttonColors(Color.White)) {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically){
                Icon(painter = painterResource(R.drawable.google_logo), contentDescription = null
                    , Modifier.size(28.dp),
                    tint = Color.Unspecified)
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Log in with Google",
                    color = Color.Black,
                    fontSize = 16.sp,)
            }

        }

        Button(onClick = {},
            modifier = Modifier.fillMaxWidth()
                .padding(4.dp),
            shape = RoundedCornerShape(6.dp),
             colors = ButtonDefaults.buttonColors(Color.Black)
        , contentPadding = PaddingValues(6.dp)) {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically){
                Icon(painter = painterResource(R.drawable.apple_logo), contentDescription = null
                , Modifier.size(28.dp))
                Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Log in with Apple",
                color = Color.White,
                fontSize = 16.sp,)
        }}

    }}


}


