package app.revanced.patches.youtube.layout.pivotbar.annotations

import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility(
    [
        Package("com.google.android.youtube"),
        Package("com.vanced.android.youtube")
    ]
)
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class PivotBarCompatibility
