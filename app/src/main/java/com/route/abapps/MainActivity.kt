package com.route.abapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material3.CompactButton
import androidx.wear.compose.material3.TextButtonDefaults
import com.route.abapps.ui.theme.ABAppsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ABAppsTheme {
                Posts()
            }
        }
    }
}
@Composable
fun Photo(){
    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "photo",
        Modifier.size(35.dp).clip(RoundedCornerShape(5.dp))
            .padding(horizontal = 2.dp))
}
@Composable
fun Post(){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp),
         horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(
                id = R.drawable.ic_launcher_background)
                , contentDescription = "My Image",
                modifier = Modifier
                    .size(25.dp)
                    .clip(RoundedCornerShape(10.dp)))
            Spacer(modifier = Modifier.padding(3.dp))
            Column() {
                Text(text = "sherif", fontSize = 8.sp)
                Text(text = "selkady@gmail.com", fontSize = 6.sp)
            }
            Spacer(modifier = Modifier.padding(4.dp))
            TextButton(onClick = { /*TODO*/ } , Modifier.size(width = 50.dp, height = 40.dp),
                shape = RoundedCornerShape(8.dp)) {
                Text(text = "Follow", fontSize = 8.sp)
            }
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Image(painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Post Image" ,
            Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(12.dp))
        )
        Spacer(modifier = Modifier.padding(5.dp))

        LazyRow(horizontalArrangement = Arrangement.Center){
            items(3){
                Photo()
            }
        }
    }
}

@Composable
fun Posts(){
    LazyColumn(Modifier.fillMaxSize().size(220.dp).width(200.dp)){
        items(10){
            Post()
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Preview(){
    Posts()
}
