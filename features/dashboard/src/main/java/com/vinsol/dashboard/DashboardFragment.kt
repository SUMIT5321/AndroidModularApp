package com.vinsol.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.vinsol.commonui.bases.BaseFragment
import com.vinsol.navigation.DeepLinkDestination
import com.vinsol.navigation.NavigationFlow
import com.vinsol.navigation.deepLinkNavigateTo

class DashboardFragment : BaseFragment() {
    private val dashboardFragmentArgs: DashboardFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.navigate_to_onboarding_btn).setOnClickListener {
            navigator.navigateToFlow(NavigationFlow.OnboardingFlow)
        }

        view.findViewById<Button>(R.id.navigate_to_next_deeplink).setOnClickListener {
            findNavController().deepLinkNavigateTo(DeepLinkDestination.Next)
        }

        view.findViewById<Button>(R.id.navigate_to_coin_list_btn).setOnClickListener {
            findNavController().navigate(DashboardFragmentDirections.actionDashboardFragmentToCoinsListFragment())
        }

        dashboardFragmentArgs.msg.let {
            if (it.isNotEmpty()) {
                Toast.makeText(requireContext(), dashboardFragmentArgs.msg, Toast.LENGTH_SHORT).show()
            }
        }
    }
}