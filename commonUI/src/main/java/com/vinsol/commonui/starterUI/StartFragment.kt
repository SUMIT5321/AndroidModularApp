package com.vinsol.commonui.starterUI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vinsol.commonui.R
import com.vinsol.commonui.bases.BaseFragment
import com.vinsol.navigation.NavigationFlow

class StartFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // decide where to go on the first app launch, check auth tokens if login needed etc...
        (0..1).random().let {
            when (it) {
                0 -> navigator.navigateToFlow(NavigationFlow.OnboardingFlow)
                1 -> navigator.navigateToFlow(NavigationFlow.DashboardFlow("From start fragment"))
            }
        }
    }
}
