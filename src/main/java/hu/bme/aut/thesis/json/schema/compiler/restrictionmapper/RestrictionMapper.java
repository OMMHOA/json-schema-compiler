package hu.bme.aut.thesis.json.schema.compiler.restrictionmapper;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.List;

public abstract class RestrictionMapper {
    public void addRestrictionsToNode(List<JSONParser.PairContext> pairs, SchemaNode node) {
        for (JSONParser.PairContext pair : pairs) {
            if (getKeywordWithQuote().equals(pair.STRING().getText())) {
                node.addRestriction(getRestriction(pair.value()));
            }
        }
    }

    public boolean matchesKeyword(String key) {
        return getKeyword().equals(key);
    }

    public static List<RestrictionMapper> getRestrictionMappers() {
        return Arrays.asList(new TypeRestrictionMapper());
    }

    private String getKeywordWithQuote() {
        return "\"" + getKeyword() + "\"";
    }

    protected abstract Restriction getRestriction(JSONParser.ValueContext value);

    protected abstract String getKeyword();
}
