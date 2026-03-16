
import android.R.attr.maxWidth
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.languageconverterapp.MenuItem
import com.example.languageconverterapp.R
import com.example.languageconverterapp.ui.theme.PurpleGrey40


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun SeventhScreen() {

    var expanded by remember { mutableStateOf(false) }
    var showLanguagesBottom by remember { mutableStateOf(false) }
    var selectedLanguageTop by remember { mutableStateOf("") }

    var selectedLanguageBottom by remember { mutableStateOf("") }
    val languages = listOf(
    MenuItem(R.drawable.india_flag,"India"),
    MenuItem(R.drawable.france,"France"),
    MenuItem(R.drawable.japan,"Japan"),
    MenuItem(R.drawable.uk,"United Kingdom")
    )


    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Black)
                .padding(16.dp)
        ) {

            Column {
                ExposedDropdownMenuBox(
                    expanded = expanded,
                    onExpandedChange = {
                        expanded = !expanded
                    }
                ) {

                    TextField(
                        value = selectedLanguageTop,
                        onValueChange = {},
                        readOnly = true,
                        placeholder = { Text("Select a name") },
                        trailingIcon = {
                            ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                        },

                        modifier = Modifier
                            .menuAnchor(MenuAnchorType.PrimaryEditable)
                            .fillMaxWidth()
                            , shape = RoundedCornerShape(12.dp)
                        , colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black,
                            cursorColor = Color.Black,
                            disabledTextColor = Color.Black,
                        )
                    )


                    ExposedDropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false },
                        modifier = Modifier.padding(20.dp)
                            .background(Color.White, shape = RoundedCornerShape(4.dp))
                    ) {

                        languages.forEach { language ->

                            DropdownMenuItem(
                                text = {

                                    Row {

                                        Icon(
                                            painter = painterResource(language.flag),
                                            contentDescription = "",
                                            tint = Color.Unspecified,
                                            modifier = Modifier.size(20.dp)
                                        )
                                        Spacer(Modifier.size(8.dp))

                                        Text(language.name)
                                    }

                                },

                                onClick = {
                                    selectedLanguageTop = language.name
                                    expanded = false
                                }
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))



                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        languages.forEach{language->
                            Surface(shape = RoundedCornerShape(20.dp),
                                color = Color(0xFF2F2F2F),
                                modifier = Modifier.clickable{
                                    selectedLanguageTop = language.name
                                    expanded = false
                                }
                                ){
                                Text(
                                   text = language.name,
                                    color = Color.White,
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(
                                        horizontal = 12.dp,
                                        vertical = 6.dp
                                    )
                                )

                            }
                        }}

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "pick_language_to_continue",
                    color = PurpleGrey40,
                    fontSize = 12.sp
                )
            }
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
                    value = selectedLanguageBottom,
                    onValueChange = {},
                    readOnly = true,
                    placeholder = { Text("Select a name") },

                    trailingIcon = {
                       ExposedDropdownMenuDefaults.TrailingIcon(expanded = showLanguagesBottom,

                            modifier = Modifier.clickable{
                                showLanguagesBottom = !showLanguagesBottom
                            }
                       )
                    },

                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Black,
                        focusedContainerColor = Color.Black,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        unfocusedPlaceholderColor = Color.White,
                        focusedPlaceholderColor = Color.White
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))

                if (showLanguagesBottom){

                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        languages.forEach{language->
                            Surface(shape = RoundedCornerShape(20.dp),
                                color = Color(0xFF2F2F2F),
                                modifier = Modifier.clickable{
                                    selectedLanguageBottom = language.name
                                    showLanguagesBottom = false
                                }
                            ){
                                Text(
                                    text = language.name,
                                    color = Color.White,
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(
                                        horizontal = 12.dp,
                                        vertical = 6.dp
                                    )
                                )

                            }
                        }}}

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "pick_language_to_continue",
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            }
        }

    }
}