package com.bmohan.fishwatch.view.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.rememberImagePainter

@Composable
fun FishListItem() {
    Card() {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = rememberImagePainter(data = "https://www.example.com/image.jpg"),
                contentDescription = null
            )
        }
    }
}

@Preview
@Composable
fun FishListItemPreview() {
    FishListItem()
}