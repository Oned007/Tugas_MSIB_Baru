package com.example.tugas_msib

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.tugas_msib.ui.theme.GreenD
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Search(){
    Box(modifier = Modifier.fillMaxSize()){
        Column (
            Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "ini Halaman 2", fontSize = 30.sp, color = GreenD)


        }
    }
}