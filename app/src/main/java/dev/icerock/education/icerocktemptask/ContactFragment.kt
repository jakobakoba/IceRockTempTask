package dev.icerock.education.icerocktemptask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment


class ContactFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    private val userId: String
        get() = requireArguments().getString(USER_ID_KEY).let{
            requireNotNull(it)
        }

    companion object {
        private const val USER_ID_KEY = "userIdKey"

        fun createArguments(userIdKey: String): Bundle {
            return bundleOf(USER_ID_KEY to userIdKey)
        }
    }

}