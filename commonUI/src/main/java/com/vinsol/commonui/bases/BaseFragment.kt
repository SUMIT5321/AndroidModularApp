package com.vinsol.commonui.bases

import androidx.fragment.app.Fragment
import com.vinsol.commonui.starterUI.MainActivity
import com.vinsol.navigation.Navigator
import java.lang.IllegalStateException

open class BaseFragment: Fragment() {
    val navigator: Navigator by lazy {
        val containingActivity = requireActivity()
        if (containingActivity is MainActivity) {
            containingActivity.navigator
        } else {
            throw IllegalStateException("Fragment must be contained inside MainActivity")
        }
    }
}