package net.rdrei.android.scdl2.ui;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class ApplicationPreferencesFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		int identifier = getResources().getIdentifier(
				getArguments().getString("resource"), "xml",
				getActivity().getPackageName());
		addPreferencesFromResource(identifier);
	}

}