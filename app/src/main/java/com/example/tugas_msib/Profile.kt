package com.example.tugas_msib

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_msib.data.Datanya
import com.example.tugas_msib.data.Inidata
import com.example.tugas_msib.ui.theme.GreenD
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Profile(){
    Box(modifier = Modifier.fillMaxSize()){
        Column (
            Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Ini Halaman 1", fontSize = 30.sp, color = GreenD)


        }
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){
        MainactivityContent1()
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
        .padding(0.dp,150.dp)
    ){
        MainactivityContent()
    }
}
@Composable
fun MainactivityContent(){
// LAZY COLUMN
    val tampildata = remember { Datanya.inidataList}
    LazyColumn (
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = tampildata,
            itemContent = {
                InidataListItem(inidata = it )
            }

        )
    }
}
@Composable
fun MainactivityContent1(){
// LAZY COLUMN
    val tampildata = remember { Datanya.inidataList}
    LazyRow (
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = tampildata,
            itemContent = {
                InidataListItem(inidata = it )
            }

        )
    }
}

@Composable
fun InidataListItem(inidata: Inidata) {
    Card(
        modifier = Modifier
            .padding(horizontal = 9.dp, vertical = 9.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {

        Row {
            InidataImageList(inidata = inidata)
            Column(
                modifier = Modifier
                    .padding(18.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = inidata.title, style = typography.headlineSmall)
                Text(text = "View Detail", style = typography.bodySmall)
            }
        }
    }
}

@Composable
fun InidataImageList(inidata: Inidata){
    Image(
        painter = painterResource(id = inidata.InidataImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}