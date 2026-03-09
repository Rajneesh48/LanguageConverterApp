
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.languageconverterapp.R
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun SeventhScreen() {

    var showLanguagesTop by remember { mutableStateOf(false) }
    var showLanguagesBottom by remember { mutableStateOf(false) }
    var selectedLanguageTop by remember { mutableStateOf("") }
    var selectedLanguageBottom by remember { mutableStateOf("") }
    val languages = listOf("English", "Spanish", "Urdu", "Hindi")

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
// ================= TOP SECTION =================
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Black)
                .padding(16.dp)
        ) {

            Column {

                TextField(
                    value = selectedLanguageTop,
                    onValueChange = {},
                    readOnly = true,
                    placeholder = { Text("Select a language") },

                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = null,
                            modifier = Modifier.clickable{
                                showLanguagesTop = !showLanguagesTop
                            }
                        )
                    },

                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),

                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))

                if (showLanguagesTop){

                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        languages.forEach{language->
                            Surface(shape = RoundedCornerShape(20.dp),
                                color = Color(0xFF2F2F2F),
                                modifier = Modifier.clickable{
                                    selectedLanguageTop= language
                                    showLanguagesTop = false
                                }
                                ){
                                Text(
                                   text = language,
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
                    placeholder = { Text("Select a language") },

                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = null,
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
                                    selectedLanguageBottom = language
                                    showLanguagesBottom = false
                                }
                            ){
                                Text(
                                    text = language,
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