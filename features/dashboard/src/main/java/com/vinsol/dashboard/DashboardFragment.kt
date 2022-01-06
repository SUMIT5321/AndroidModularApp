package com.vinsol.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.vinsol.navigation.DeepLinkDestination
import com.vinsol.navigation.NavigationFlow
import com.vinsol.navigation.ToFlowNavigatable
import com.vinsol.navigation.deepLinkNavigateTo

class DashboardFragment : Fragment() {
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

        view.findViewById<Button>(R.id.navigate_to_home_btn).setOnClickListener {
            (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.OnboardingFlow)
        }

        view.findViewById<Button>(R.id.navigate_to_next_deeplink).setOnClickListener {
            findNavController().deepLinkNavigateTo(DeepLinkDestination.Next)
        }

        dashboardFragmentArgs.msg.let {
            if (it.isNotEmpty()) {
                Toast.makeText(requireContext(), dashboardFragmentArgs.msg, Toast.LENGTH_SHORT).show()
            }
        }
    }
}