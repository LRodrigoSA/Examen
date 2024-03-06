import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.material3.Card
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.foundation.lazy.LazyColumn


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.examen.R


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun Inicio() {
    val openDialog = remember { mutableStateOf(false) }
    Column {
        Scaffold(
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
                    title = {
                        Text(
                            "Inicio",
                            overflow = TextOverflow.Ellipsis
                        )
                    },
                    actions = {
                        Icon(Icons.Filled.Search, contentDescription = null)
                        Icon(Icons.Filled.MoreVert, contentDescription = null)
                    }
                )


            },
            content = { innerPadding ->
                LazyColumn(
                    contentPadding = innerPadding,
                ) {
                    item {
                        Card(
                            modifier = Modifier.padding(16.dp),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.a),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(200.dp)
                                        .fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = "Paisaje 1",
                                    modifier = Modifier.padding(16.dp)
                                )
                                Icon(Icons.Filled.MoreVert, contentDescription = null, Modifier.clickable { openDialog.value = true })
                            }
                            if (openDialog.value) {
                                AlertDialog(
                                    onDismissRequest = { openDialog.value = false },
                                    title = { Text(text = "Paisaje 1") },
                                    text = { Text("Un paisaje verde.") },
                                    confirmButton = {
                                        Button(onClick = { openDialog.value = false }) {
                                            Text("Cerrar")
                                        }
                                    }
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))

                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.b),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(200.dp)
                                        .fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = "Paisaje 2",
                                    modifier = Modifier.padding(16.dp)
                                )
                                Icon(Icons.Filled.MoreVert, contentDescription = null, Modifier.clickable { openDialog.value = true })
                            }
                            if (openDialog.value) {
                                AlertDialog(
                                    onDismissRequest = { openDialog.value = false },
                                    title = { Text(text = "Paisaje 2") },
                                    text = { Text("Un paisaje.") },
                                    confirmButton = {
                                        Button(onClick = { openDialog.value = false }) {
                                            Text("Cerrar")
                                        }
                                    }
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.c),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(200.dp)
                                        .fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = "Paisaje 3",
                                    modifier = Modifier.padding(16.dp)
                                )
                                Icon(Icons.Filled.MoreVert, contentDescription = null, Modifier.clickable { openDialog.value = true })
                                if (openDialog.value) {
                                    AlertDialog(
                                        onDismissRequest = { openDialog.value = false },
                                        title = { Text(text = "Paisaje 3") },
                                        text = { Text("Un atardecer con flores.") },
                                        confirmButton = {
                                            Button(onClick = { openDialog.value = false }) {
                                                Text("Cerrar")
                                            }
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        )
    }
}