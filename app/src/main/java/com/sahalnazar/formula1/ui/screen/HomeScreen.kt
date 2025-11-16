package com.sahalnazar.formula1.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sahalnazar.formula1.R
import com.sahalnazar.formula1.navigation.Screen
import com.sahalnazar.formula1.ui.component.DistanceCoveredCard
import com.sahalnazar.formula1.ui.component.EducationCard
import com.sahalnazar.formula1.ui.component.InstagramCard
import com.sahalnazar.formula1.ui.component.MoreThanJustAnAppPage
import com.sahalnazar.formula1.ui.component.RaceTime
import com.sahalnazar.formula1.ui.component.RiderPage
import com.sahalnazar.formula1.ui.component.RiderPageData
import com.sahalnazar.formula1.ui.component.UpcomingRaceCard
import com.sahalnazar.formula1.ui.component.UpcomingRaceCardData
import com.sahalnazar.formula1.ui.theme.AppTheme
import com.sahalnazar.formula1.util.UrlUtils
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(navController: NavHostController) {
    val context = LocalContext.current
    val pagerState = rememberPagerState(pageCount = { 2 })

    LaunchedEffect(pagerState) {
        while (true) {
            delay(3000)
            val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.animateScrollToPage(nextPage)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.color.black)
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(420.dp),
                pageSize = PageSize.Fill
            ) { page ->
                when (page) {
                    0 -> {
                        RiderPage(
                            modifier = Modifier.fillMaxSize(),
                            data = RiderPageData(
                                bgColor = AppTheme.color.mcLaren,
                                riderName = "Lando Norris",
                                riderImage = R.drawable.img_lando_norris,
                                riderPos = 2,
                                riderWins = 4,
                                riderPts = 374
                            )
                        )
                    }

                    1 -> {
                        MoreThanJustAnAppPage(
                            modifier = Modifier.fillMaxSize(),
                            onFollowUsClick = {
                                UrlUtils.openUrl(context, "https://www.instagram.com/boxbox_club/")
                            }
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(top = 340.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                repeat(pagerState.pageCount) { index ->
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .clip(CircleShape)
                            .background(
                                if (pagerState.currentPage == index) {
                                    AppTheme.color.white
                                } else {
                                    AppTheme.color.white.copy(alpha = 0.3f)
                                }
                            )
                    )
                }
            }
        }

        Column(
            modifier = Modifier.padding(18.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Max),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                UpcomingRaceCard(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    upcomingRaceCardData = UpcomingRaceCardData(
                        name = "FP1",
                        date = "22 Friday",
                        raceTime = RaceTime(
                            time = "5:00",
                            amOrPm = "PM"
                        ),
                        circuitImage = R.drawable.ic_circuit
                    ),
                    onClick = {
                        navController.navigate(Screen.RaceDetail.route)
                    }
                )

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    DistanceCoveredCard(
                        modifier = Modifier.weight(1f),
                        currentDistance = 342f,
                        totalDistance = 500f,
                        distanceUnit = "KM"
                    )

                    EducationCard(
                        modifier = Modifier.weight(1f),
                        onClick = {
                            UrlUtils.openUrl(context, "https://blog.boxbox.club/tagged/beginners-guide")
                        }
                    )
                }
            }
            InstagramCard(
                image = painterResource(R.drawable.img_instagram),
                onClick = {
                    UrlUtils.openUrl(context, "https://www.instagram.com/boxbox_club/")
                }
            )
        }
    }
}
