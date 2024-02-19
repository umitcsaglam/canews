package com.can.canews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.can.canews.presentaiton.onboarding.OnBoardingScreen
import com.can.canews.presentaiton.onboarding.Page
import com.can.canews.presentaiton.onboarding.components.OnBoardingPage
import com.can.canews.presentaiton.onboarding.pages
import com.can.canews.ui.theme.CanewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            CanewsTheme {
                Box(modifier = Modifier.background(color=MaterialTheme.colorScheme.background)){}
                OnBoardingScreen()

                }
            }
        }
    }


