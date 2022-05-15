package com.pr0m3th3usex.sayoutloud.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.theme.ButtonColor
import com.pr0m3th3usex.sayoutloud.ui.theme.Gray400
import com.pr0m3th3usex.sayoutloud.ui.theme.Gray700
import com.pr0m3th3usex.sayoutloud.ui.theme.SolGradient
import java.util.*

@Composable
fun RecordCard(
    navController: NavHostController,
    id: String, title: String, views: Int, createdAt: Date) {
    val background = if (isSystemInDarkTheme()) {
        Gray700
    } else {
        Color.White
    }

    Card(
        shape = RoundedCornerShape(size = 8.dp),
        backgroundColor = background,
        modifier = Modifier
            .fillMaxWidth()
            .height(height = 180.dp)
            .clickable {

            },
        elevation = 4.dp,
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .background(SolGradient)
            )
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = title, style = MaterialTheme.typography.body1, fontSize = 14.sp)
                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = Modifier.size(18.dp),
                            painter = painterResource(id = R.drawable.ic_play),
                            tint = ButtonColor,
                            contentDescription = "Plays"
                            )
                        Text(text = "$views", style = MaterialTheme.typography.body1, fontSize = 11.sp)
                    }
                    Text(text = "$createdAt", style = MaterialTheme.typography.body1, fontSize = 10.sp, color = Gray400)
                }
            }
        }
    }
}

@Preview
@Composable
fun RecordCardPreview() {
    val navController = rememberNavController();
    RecordCard(navController, id = "1", title = "Sound title", views = 1200000, createdAt = Date())
}