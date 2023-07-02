package fr.adrienbrault.idea.symfony2plugin.stubs.dict;

import fr.adrienbrault.idea.symfony2plugin.templating.dict.TwigMacroTagInterface;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Daniel Espendiller <daniel@espendiller.net>
 */
public record UxComponent(@NotNull String name, @NotNull String phpClass, @Nullable String template) implements Serializable {
    @Override
    public int hashCode() {
        return new HashCodeBuilder()
            .append(this.name)
            .append(this.phpClass)
            .append(this.template)
            .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof UxComponent
            && Objects.equals(((UxComponent) obj).name(), this.name)
            && Objects.equals(((UxComponent) obj).phpClass(), this.phpClass)
            && Objects.equals(((UxComponent) obj).template(), this.template);
    }
}