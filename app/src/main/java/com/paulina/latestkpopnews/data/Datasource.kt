package com.paulina.latestkpopnews.data

import com.paulina.latestkpopnews.R
import com.paulina.latestkpopnews.model.LatestKpopNews
import com.paulina.latestkpopnews.model.KpopGroup

class Datasource {

    // List of latest K-Pop news items with URLs
    private val latestKpopNewsList = listOf(
        LatestKpopNews(
            imageResourceId = R.drawable.babymonster,
            stringResourceId = R.string.news_title_babymonster,
            url = "https://www.liputan6.com/citizen6/read/5769628/babymonster-puncaki-tangga-lagu-itunes-dengan-album-terbaru-drip"
        ),
        LatestKpopNews(
            imageResourceId = R.drawable.bts,
            stringResourceId = R.string.news_title_bts,
            url = "https://www.detik.com/pop/korean-wave/d-7606160/jin-bts-buka-perilisan-album-happy-dengan-single-ill-be-there"
        ),
        LatestKpopNews(
            imageResourceId = R.drawable.seventeen,
            stringResourceId = R.string.news_title_seventeen,
            url = "https://www.detik.com/pop/korean-wave/d-7694596/10-konser-k-pop-paling-cuan-2024-versi-billboard"
        ),
        LatestKpopNews(
            imageResourceId = R.drawable.straykids,
            stringResourceId = R.string.news_title_straykids,
            url = "https://www.liputan6.com/regional/read/5715110/stray-kids-umumkan-proyek-baru-king-giant"
        )
        // Add more news items as needed
    )

    // List of K-Pop groups
    private val kpopGroupsList = listOf(
        KpopGroup(
            imageResourceId = R.drawable.treasure,
            nameResourceId = R.string.group_name_treasure
        ),
        KpopGroup(
            imageResourceId = R.drawable.straykids,
            nameResourceId = R.string.group_name_straykids
        ),
        KpopGroup(
            imageResourceId = R.drawable.fromis_9,
            nameResourceId = R.string.group_name_fromis_9
        ),
        KpopGroup(
            imageResourceId = R.drawable.seventeen,
            nameResourceId = R.string.group_name_seventeen
        ),
        KpopGroup(
            imageResourceId = R.drawable.lesserafim,
            nameResourceId = R.string.group_name_lesserafim
        ),
        KpopGroup(
            imageResourceId = R.drawable.enhypen,
            nameResourceId = R.string.group_name_enhypen
        ),
        KpopGroup(
            imageResourceId = R.drawable.babymonster,
            nameResourceId = R.string.group_name_babymonster
        ),
        KpopGroup(
            imageResourceId = R.drawable.bts,
            nameResourceId = R.string.group_name_bts
        ),
        KpopGroup(
            imageResourceId = R.drawable.txt,
            nameResourceId = R.string.group_name_txt
        ),
        KpopGroup(
            imageResourceId = R.drawable.nctdream,
            nameResourceId = R.string.group_name_nctdream
        ),
        KpopGroup(
            imageResourceId = R.drawable.aespa,
            nameResourceId = R.string.group_name_aespa
        ),
        KpopGroup(
            imageResourceId = R.drawable.ive,
            nameResourceId = R.string.group_name_ive
        ),
        KpopGroup(
            imageResourceId = R.drawable.ikon,
            nameResourceId = R.string.group_name_ikon
        ),
        KpopGroup(
            imageResourceId = R.drawable.redvelvet,
            nameResourceId = R.string.group_name_redvelvet
        ),
        KpopGroup(
            imageResourceId = R.drawable.blackpink,
            nameResourceId = R.string.group_name_blackpink
        ),
        KpopGroup(
            imageResourceId = R.drawable.boynextdoor,
            nameResourceId = R.string.group_name_boynextdoor
        ),
        KpopGroup(
            imageResourceId = R.drawable.twice,
            nameResourceId = R.string.group_name_twice
        )
        // Add more K-Pop groups as needed
    )

    // Function to load latest K-Pop news
    fun loadLatestKpopNews(): List<LatestKpopNews> {
        return latestKpopNewsList
    }

    // Function to load K-Pop groups
    fun loadKpopGroups(): List<KpopGroup> {
        return kpopGroupsList
    }
}