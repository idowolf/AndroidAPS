package info.nightscout.androidaps.plugins.constraints.objectives.objectives

import dagger.android.HasAndroidInjector
import info.nightscout.androidaps.R

@Suppress("SpellCheckingInspection")
class Objective2(injector: HasAndroidInjector) : Objective(injector, "exam", R.string.objectives_exam_objective, R.string.objectives_exam_gate) {

    init {
    }
}