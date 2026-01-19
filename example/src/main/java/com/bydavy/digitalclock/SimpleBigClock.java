package com.bydavy.digitalclock;

import android.app.Activity;
import android.os.Bundle;
import com.bydavy.morpher.DigitalClockView;
import com.bydavy.morpher.font.DFont;
import com.github.h6ah4i.numbermorphing.example.R;

import java.text.SimpleDateFormat;

public class SimpleBigClock extends Activity implements SystemClockManager.SystemClockListener {

	public static final String EXTRA_MORPHING_DURATION = "morphing_duration";

	private DigitalClockView mDigitalClockView;
	private SystemClockManager mSystemClockManager;
	private SimpleDateFormat mSimpleDateFormat;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simple_big_clock);

		mDigitalClockView = (DigitalClockView) findViewById(R.id.digitalClock);
		mDigitalClockView.setFont(new DFont(130, 10));

		int morphingDuration = getIntent().getIntExtra(EXTRA_MORPHING_DURATION, DigitalClockView.DEFAULT_MORPHING_DURATION);
		mDigitalClockView.setMorphingDuration(morphingDuration);

		mSimpleDateFormat = new SimpleDateFormat("hh:mm:ss");
		mSystemClockManager = new SystemClockManager(this);
	}

	@Override
	protected void onResume() {
		super.onResume();
		mSystemClockManager.start();
	}

	@Override
	protected void onPause() {
		super.onPause();
		mSystemClockManager.stop();
	}

	@Override
	public void onTimeChanged(long time) {
		String formattedTime = mSimpleDateFormat.format(time);

		// Useful when a long morphing duration is set otherwise we never see the destination number as it's always morphing
		if (!mDigitalClockView.isMorphingAnimationRunning()) {
			mDigitalClockView.setTime(formattedTime);
		}
	}
}
