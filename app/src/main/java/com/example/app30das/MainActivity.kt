package com.example.app30das

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app30das.ui.theme.App30DíasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App30DíasTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainContent()
                }
            }
        }
    }
}

val images = listOf(
    R.drawable.nft1,
    R.drawable.nft2,
    R.drawable.nft3,
    R.drawable.nft4,
    R.drawable.nft5,
    R.drawable.nft6,
    R.drawable.nft7,
    R.drawable.nft8,
    R.drawable.nft9,
    R.drawable.nft10,
    R.drawable.nft11,
    R.drawable.nft12,
    R.drawable.nft13,
    R.drawable.nft14,
    R.drawable.nft15,
    R.drawable.nft16,
    R.drawable.nft17,
    R.drawable.nft18,
    R.drawable.nft19,
    R.drawable.nft20,
    R.drawable.nft21,
    R.drawable.nft22,
    R.drawable.nft23,
    R.drawable.nft24,
    R.drawable.nft25,
    R.drawable.nft26,
    R.drawable.nft27,
    R.drawable.nft28,
    R.drawable.nft29,
    R.drawable.nft30,
)

data class NFTInfo(val title: String, val description: String)

val nftMap = mapOf(
    R.drawable.nft1 to NFTInfo("You just bought the NFT 190", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft2 to NFTInfo("You just bought the NFT 199", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft3 to NFTInfo("You just bought the NFT 198", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft4 to NFTInfo("You just bought the NFT 197", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft5 to NFTInfo("You just bought the NFT 194", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft6 to NFTInfo("You just bought the NFT 193", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft7 to NFTInfo("You just bought the NFT 192", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft8 to NFTInfo("You just bought the NFT 191", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft9 to NFTInfo("You just bought the NFT 190", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft10 to NFTInfo("You just bought the NFT 185", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft11 to NFTInfo("You just bought the NFT 187", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft12 to NFTInfo("You just bought the NFT 183", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft13 to NFTInfo("You just bought the NFT 182", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft14 to NFTInfo("You just bought the NFT 180", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft15 to NFTInfo("You just bought the NFT 179", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft16 to NFTInfo("You just bought the NFT 177", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft17 to NFTInfo("You just bought the NFT 176", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft18 to NFTInfo("You just bought the NFT 175", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft19 to NFTInfo("You just bought the NFT 174", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft20 to NFTInfo("You just bought the NFT 173", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft21 to NFTInfo("You just bought the NFT 172", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft22 to NFTInfo("You just bought the NFT 10", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft23 to NFTInfo("You just bought the NFT 100", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft24 to NFTInfo("You just bought the NFT 105", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft25 to NFTInfo("You just bought the NFT 11", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft26 to NFTInfo("You just bought the NFT 110", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft27 to NFTInfo("You just bought the NFT 112", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft28 to NFTInfo("You just bought the NFT 134", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft29 to NFTInfo("You just bought the NFT 129", "By win-official. NFT Monkey Art Pirate Club."),
    R.drawable.nft30 to NFTInfo("You just bought the NFT 128", "By win-official. NFT Monkey Art Pirate Club."),
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Fondo de la aplicación
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.White // Color de fondo
        ) {
            Column {
                // Delimitador para el TopAppBar
                Divider(
                    color = Color.LightGray,
                    thickness = 1.dp,
                    modifier = Modifier.fillMaxWidth()
                )
                TopAppBar(
                    title = {
                        Text(
                            text = "NFT MARKETPLACE",
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentWidth(Alignment.CenterHorizontally), // Centrar el texto horizontalmente
                            fontWeight = FontWeight.Bold, // Texto en negrita
                        )
                    }
                )
                Divider(
                    color = Color.DarkGray,
                    thickness = 2.dp,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp)) // Agregar un espacio en la parte superior
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Welcome back, ",
                        fontWeight = FontWeight.Normal, // Texto normal
                        modifier = Modifier.padding(start = 26.dp) // Añadir un espacio en el margen izquierdo
                    )
                    Text(
                        text = "Andre",
                        fontWeight = FontWeight.Bold, // Texto en negrita
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    CardList()
                }
            }
        }
    }
}

@Composable
fun CardList() {
    LazyColumn {
        items(images.size) { index ->
            val image = images.getOrNull(index) ?: R.drawable.nft1
            CardItem(
                image = image
            )
        }
    }
}

@Composable
fun CardItem(image: Int) {
    val (message, setMessage) = remember { mutableStateOf("") }
    val (dialogTitle, setDialogTitle) = remember { mutableStateOf("") }
    val (isDialogOpen, setDialogOpen) = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp) // Altura total de la tarjeta
            .padding(vertical = 8.dp) // Agregar un poco de espacio vertical entre cada tarjeta
            .clip(RoundedCornerShape(16.dp)) // Bordes circulares en los lados verticales
            .background(Color.White) // Fondo blanco para asegurar que los bordes sean visibles
    ) {
        Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Bottom) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp), // Altura de la imagen
                contentScale = ContentScale.Crop // Escala de contenido para recortar la imagen si es necesario
            )
            Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y los botones
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        val nftInfo = nftMap[image]
                        nftInfo?.let {
                            setMessage(nftInfo.description)
                            setDialogTitle("Description")
                            setDialogOpen(true)
                        }
                    },
                    modifier = Modifier
                        .height(50.dp) // Altura del botón
                        .weight(1f)
                ) {
                    Text(text = "SEE", color = Color.White)
                }
                Spacer(modifier = Modifier.width(8.dp)) // Separación entre botones
                Button(
                    onClick = {
                        val nftInfo = nftMap[image]
                        nftInfo?.let {
                            setMessage(nftInfo.title)
                            setDialogTitle("Alert")
                            setDialogOpen(true)
                        }
                    },
                    modifier = Modifier
                        .height(50.dp) // Altura del botón
                        .weight(1f)
                ) {
                    Text(text = "BUY", color = Color.White)
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = message,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
    }

    if (isDialogOpen) {
        AlertDialog(
            onDismissRequest = {
                setDialogOpen(false)
            },
            title = {
                Text(dialogTitle)
            },
            text = {
                Text(message)
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        setDialogOpen(false)
                    },
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = MaterialTheme.colorScheme.primary
                    )
                ) {
                    Text("Accept")
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    App30DíasTheme {
        MainContent()
    }
}


