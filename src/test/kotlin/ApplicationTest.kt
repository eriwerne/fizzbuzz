import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApplicationTest{
    private val mock = mockk<FizzBuzzGenerator>()
    private val application = Application(mock)

    @Test
    fun test(){
        every { mock.createString() } returns "XYZ"
        val actual = application.run()
        assertThat(actual).isEqualTo("XYZ")
    }
}
