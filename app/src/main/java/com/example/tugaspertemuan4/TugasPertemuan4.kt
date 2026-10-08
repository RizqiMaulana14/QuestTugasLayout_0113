package com.example.secondapp

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugaspertemuan4.R

@Composable
fun Seluruh(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(
                horizontal = 20.dp,
                vertical = 30.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(22.dp)
        )

        BiodataCard(
            nama = R.string.nama_1,
            nomor = null,
            alamat = R.string.alamat_1,
            warna = R.color.card_1,
            namaFont = FontFamily.Cursive
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        BiodataCard(
            nama = R.string.nama_2,
            nomor = R.string.nomor_2,
            alamat = R.string.alamat_2,
            warna = R.color.card_2,
            namaFont = FontFamily.Cursive
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        BiodataCard(
            nama = R.string.nama_3,
            nomor = R.string.nomor_3,
            alamat = R.string.alamat_3,
            warna = R.color.card_3,
            namaFont = FontFamily.Cursive
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        BiodataCard(
            nama = R.string.nama_4,
            nomor = R.string.nomor_4,
            alamat = R.string.alamat_4,
            warna = R.color.card_4,
            namaFont = FontFamily.Cursive
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Text(
            text = stringResource(R.string.copy),
            fontSize = 12.sp
        )
    }
}

@Composable
fun BiodataCard(
    nama: Int,
    nomor: Int?,
    alamat: Int,
    warna: Int,
    namaFont: FontFamily = FontFamily.Default
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(98.dp),

        colors = CardDefaults.cardColors(
            containerColor = colorResource(warna)
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),

            verticalAlignment = Alignment.CenterVertically,

            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Image(
                painter = painterResource(
                    id = R.drawable.logo
                ),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp)
            ) {

                Text(
                    text = stringResource(id = nama),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = namaFont,
                    color = colorResource(id = R.color.merah)
                )

                if (nomor != null) {
                    Text(
                        text = stringResource(id = nomor),
                        fontSize = 13.sp,
                        color = colorResource(id = R.color.putih)
                    )
                }
