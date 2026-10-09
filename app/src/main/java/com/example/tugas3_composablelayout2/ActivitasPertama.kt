package com.example.tugas3_composablelayout2

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header
            Text(
                text = stringResource(id = R.string.prodi),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.univ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Card 1
            DetailCard(
                nama = stringResource(id = R.string.nama_1),
                alamat = stringResource(id = R.string.alamat_1),
                backgroundColor = colorResource(id = R.color.gray_card),
                fontFamily = FontFamily.Cursive
            )

            // Card 2
            DetailCard(
                nama = stringResource(id = R.string.nama_2),
                noHp = stringResource(id = R.string.no_hp_2),
                alamat = stringResource(id = R.string.alamat_2),
                backgroundColor = colorResource(id = R.color.purple_card)
            )

            // Card 3
            DetailCard(
                nama = stringResource(id = R.string.nama_3),
                noHp = stringResource(id = R.string.no_hp_3),
                alamat = stringResource(id = R.string.alamat_3),
                backgroundColor = colorResource(id = R.color.blue_card)
            )

            // Card 4
            DetailCard(
                nama = stringResource(id = R.string.nama_4),
                noHp = stringResource(id = R.string.no_hp_4),
                alamat = stringResource(id = R.string.alamat_4),
                backgroundColor = colorResource(id = R.color.green_card)
            )
        }
