package com.example.languageconverterapp

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.languageconverterapp.R

@Preview(showBackground = true)
@Composable
fun EigthScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Black)
                .padding(top = 10.dp)
        ) {


            Column(
                modifier = Modifier
                    .padding(horizontal = 8.dp, ),
                horizontalAlignment = Alignment.Start
            ) {

                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.LightGray)
                        .padding(horizontal = 12.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .size(20.dp)
                            .background(Color.Green, CircleShape)
                    )

                    Spacer(Modifier.width(6.dp))

                    Text("Hindi", color = Color.Black)
                }

                Spacer(Modifier.height(16.dp))

                Text(
                    text = "आपने अपनी भाषा के रूप में हिंदी को चुना है.",
                    color = Color.White,
                    fontSize = 44.sp
                )
            }

            Icon(
                painter = painterResource(R.drawable.frame24),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 10.dp, end = 8.dp)
                    .size(50.dp)

            )
        }

        // ================= BOTTOM SECTION =================
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFF1E1E1E))
                .padding(16.dp)
        ) {

            Column {


                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(
                            stringResource(R.string.select_a_language),
                            color = Color.Gray
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(40.dp)
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp)),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Black,
                        focusedContainerColor = Color.Black,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent

                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {

                    listOf(
                        stringResource(R.string.english),
                        stringResource(R.string.spanish),
                        stringResource(R.string.urdu),
                        stringResource(R.string.hindi)
                    ).forEach {

                        Surface(
                            shape = RoundedCornerShape(20.dp),
                            color = Color(0xFF2F2F2F)
                        ) {
                            Text(
                                it,
                                color = Color.White,
                                fontSize = 12.sp,
                                modifier = Modifier.padding(
                                    horizontal = 12.dp,
                                    vertical = 6.dp
                                )
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    stringResource(R.string.pick_language_to_continue),
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            }

            // MIC BUTTON
            Surface(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(70.dp),
                shape = RoundedCornerShape(20.dp),
                color = Color.Black
            ) {
                Icon(
                    painterResource(R.drawable.frame_22),
                    contentDescription = null,
                    tint = Color.Unspecified,
                )
            }
        }
    }
}
