package com.testpre.tutorialstring

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun replaceFragment(fragment: Fragment, activity: FragmentActivity?, canBack: Boolean) {
    activity?.let {
        if (it.isFinishing) {
            return
        }
        val transaction = activity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_layout, fragment)
        if (canBack) {
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }
}