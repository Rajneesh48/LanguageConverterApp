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
fun NinthScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(color =Color.Black)
                .padding(16.dp)

        ) {

            Column {

                Spacer(modifier = Modifier.height(32.dp))

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
                    colors =TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White,

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

            // SEND BUTTON

            Icon(
                painterResource(R.drawable.frame24),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(40.dp)
            )

        }



        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFF1E1E1E))
                .padding(top = 10.dp)
        ) {

            Column(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(8.dp)
            ) {

                // Language Chip
                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.LightGray)
                        .padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    // Replace with Flag
                    Box(
                        modifier = Modifier
                            .size(20.dp)
                            .background(Color.Red, CircleShape)
                    )

                    Spacer(Modifier.width(6.dp))

                    Text("Italian", color = Color.Black)
                }

                Spacer(Modifier.height(16.dp))

                Text(
                    text = "Hai selezionato l'hindi come lingua.",
                    color = Color.White,
                    fontSize = 44.sp
                )
            }


            Icon(
                painter = painterResource(R.drawable.frame_22),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(18.dp))
                    .padding(18.dp)
                , tint = Color.Unspecified
            )
        }

    }
    }

