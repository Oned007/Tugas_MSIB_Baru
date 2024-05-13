package com.example.tugas_msib

import android.provider.MediaStore.Images
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
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
fun Home(){
    Box(modifier = Modifier.fillMaxSize()){
        Column (
            Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Ini Halaman lazy grid", fontSize = 30.sp, color = GreenD)


        }
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){
        MainactivityContent2()
    }
}

//LazyGrid
@Composable
fun MainactivityContent2(){
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        item(span ={ GridItemSpan(maxLineSpan) })
        {

        }
    }

}

