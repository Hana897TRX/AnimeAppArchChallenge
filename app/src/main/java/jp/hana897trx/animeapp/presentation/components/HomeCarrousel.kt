package jp.hana897trx.animeapp.presentation.components

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import jp.hana897trx.animeapp.databinding.HomeCarrouselLayoutBinding

class HomeCarrousel(ctx: Context, attrs: AttributeSet) : ConstraintLayout(ctx, attrs) {
    private var binding: HomeCarrouselLayoutBinding?= null
    init {
        inflate()
    }
}