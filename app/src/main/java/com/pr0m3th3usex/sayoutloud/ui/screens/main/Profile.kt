package com.pr0m3th3usex.sayoutloud.ui.screens.main

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.components.CustomTopBar
import com.pr0m3th3usex.sayoutloud.ui.components.RecordCard
import com.pr0m3th3usex.sayoutloud.ui.navigation.Screen
import com.pr0m3th3usex.sayoutloud.ui.theme.ButtonColor
import java.util.*

@Composable
fun Profile(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text("Pr0m3th3usEx", style = MaterialTheme.typography.h2, fontSize = 24.sp)
            IconButton(
                onClick = { navController.navigate(Screen.Settings.route) },
            ) {
                Icon(painter = painterResource(id = R.drawable.ic_setting), contentDescription = "Settings")
            }
        }

        val scroll = rememberScrollState();

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scroll),
            verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Box(
                    modifier = Modifier
                        .size(130.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFFCD999))
                        .border(
                            border = BorderStroke(width = 2.dp, color = ButtonColor),
                            shape = CircleShape
                        )
                )

                Text(
                    "120 records",
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "120M subscribers",
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Bold
                )
            }

            Text("Records", style = MaterialTheme.typography.body1)

            Column(modifier = Modifier.padding(bottom = 100.dp), verticalArrangement = Arrangement.spacedBy(19.dp)) {
                RecordCard(navController, id = "1", title = "Sound title", views = 1000000, createdAt = Date())
                RecordCard(navController, id = "1", title = "Sound title", views = 1000000, createdAt = Date())
                RecordCard(navController, id = "1", title = "Sound title", views = 1000000, createdAt = Date())
                RecordCard(navController, id = "1", title = "Sound title", views = 1000000, createdAt = Date())
                RecordCard(navController, id = "1", title = "Sound title", views = 1000000, createdAt = Date())
                RecordCard(navController, id = "1", title = "Sound title", views = 1000000, createdAt = Date())
            }
        }
    }
}