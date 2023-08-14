package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MaxNumberTest : StringSpec({
    "Max of 1, 2 = 2" {
        max(1, 2) shouldBe 2
    }

    "Max of 2, -1 = 2" {
        max(2, -1) shouldBe 2
    }

    "Max of 1, 2, 3 = 3" {
        max(1, 2, 3) shouldBe 3
    }

    "Max of 0, 4, -2 = 3" {
        max(0, 4, -2) shouldBe 4
    }

    "Max of 2, 1, -1 = 2" {
        max(2, 1, -1) shouldBe 2
    }
})