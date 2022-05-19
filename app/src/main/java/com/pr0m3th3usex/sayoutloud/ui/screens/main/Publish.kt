package com.pr0m3th3usex.sayoutloud.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.components.CustomTopBar

@Composable
fun Publish(navController: NavHostController) {
    Column {
        CustomTopBar(title = stringResource(id = R.string.publish_page_title),
            onPrevious = { navController.popBackStack() }
        )
    }
}