package com.jcdesign.vknewsclient

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun PostCard(){
    Card(){
        Row(){
            Image(
                painter = painterResource(id = R.drawable.post_comunity_thumbnail),
                contentDescription = ""
            )
            Column() {
                Text("dev/null/")
                Text("14:00")

            }
            Image(
                painter = painterResource(id = R.drawable.post_content_image),
                contentDescription = ""
            )
        }
    }
}