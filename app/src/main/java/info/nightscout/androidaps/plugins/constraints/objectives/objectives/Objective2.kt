package info.nightscout.androidaps.plugins.constraints.objectives.objectives

import dagger.android.HasAndroidInjector
import info.nightscout.androidaps.R

@Suppress("SpellCheckingInspection")
class Objective2(injector: HasAndroidInjector) : Objective(injector, "exam", R.string.objectives_exam_objective, R.string.objectives_exam_gate) {

    init {
        tasks.add(ExamTask(this, R.string.prerequisites_label, R.string.prerequisites_what, "prerequisites")
            .option(Option(R.string.prerequisites_nightscout, true))
            .option(Option(R.string.prerequisites_computer, true))
            .option(Option(R.string.prerequisites_pump, true))
            .option(Option(R.string.prerequisites_beanandroiddeveloper, false))
            .hint(Hint(R.string.prerequisites_hint1))
        )
    }
}