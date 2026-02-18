package com.example.languageconverterapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ThirdScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(20.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(60.dp))


            Icon(
                painter = painterResource(id = R.drawable.vector_6),
                contentDescription = "Center Icon",
                modifier = Modifier
                    .size(90.dp)
                    .background(Color.Gray)
            )

            Spacer(modifier = Modifier.height(40.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("Enter Phone / Email") },
                    trailingIcon = {
                        Text(
                            text = "Get OTP",
                            color = Color.Black,
                            modifier = Modifier
                                .clickable {  }
                                .padding(end = 8.dp)
                        )
                    },

                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.LightGray,
                        focusedContainerColor = Color.LightGray
                    )

                )

                Spacer(modifier = Modifier.width(10.dp))


            }

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Enter OTP") },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.LightGray,
                    focusedContainerColor = Color.LightGray
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Submit Button Right Side
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.height(50.dp)
                ) {
                    Text("Submit")
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            // Bottom Text
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec tempor, lacus in consequat cursus, ex risus rhoncus eros, vitae pharetra nibh ante eu lorem. Suspendisse sit amet tellus aliquam, efficitur mauris",
                color = Color.Gray,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 20.dp)
            )
        }
    }
}
