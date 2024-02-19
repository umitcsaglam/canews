package com.can.canews.presentaiton.onboarding.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.can.canews.R
import com.can.canews.presentaiton.onboarding.Dimens.MediumPadding1
import com.can.canews.presentaiton.onboarding.Dimens.MediumPadding2
import com.can.canews.presentaiton.onboarding.Page
import com.can.canews.presentaiton.onboarding.pages
import com.can.canews.ui.theme.CanewsTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier=Modifier,
    page: Page
) {
    Column(modifier=modifier){
        Image(
            modifier= Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f),
            painter = painterResource(id = page.image),
            contentDescription = "onBoardingImg",
            contentScale = ContentScale.Crop
        )
        Spacer(modifier =Modifier.height(MediumPadding1))
        Text(
            text =page.title,
            modifier=Modifier.padding(MediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )
        Text(
            text =page.description,
            modifier=Modifier.padding(MediumPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }

}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES,showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    CanewsTheme {
        OnBoardingPage(
            page = pages[0]
        )
        
    }
    
}