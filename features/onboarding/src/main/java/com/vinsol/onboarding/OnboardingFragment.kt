package com.vinsol.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vinsol.navigation.NavigationFlow
import com.vinsol.navigation.ToFlowNavigatable


class OnboardingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboarding, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.to_next_fragment_btn).setOnClickListener {
            findNavController().navigate(OnboardingFragmentDirections.actionOnboardingFragmentToNextFragment())
        }

        view.findViewById<Button>(R.id.to_dashboard_flow).setOnClickListener {
            (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.DashboardFlow("From home fragment"))
        }
    }
}