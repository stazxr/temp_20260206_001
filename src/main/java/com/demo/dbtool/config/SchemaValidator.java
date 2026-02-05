public class SchemaValidator {

    public static void validateYaml(String yamlPath) throws Exception {

        ObjectMapper yamlReader =
                new ObjectMapper(new YAMLFactory());
        JsonNode yamlNode =
                yamlReader.readTree(new File(yamlPath));

        InputStream schemaStream =
                SchemaValidator.class
                        .getResourceAsStream("/schema/config-schema.json");

        JsonSchemaFactory factory =
                JsonSchemaFactory.getInstance(
                        SpecVersion.VersionFlag.V7);

        JsonSchema schema =
                factory.getSchema(schemaStream);

        Set<ValidationMessage> errors =
                schema.validate(yamlNode);

        if (!errors.isEmpty()) {
            errors.forEach(e ->
                    System.err.println("Schema error: " + e));
            throw new RuntimeException("YAML schema invalid");
        }
    }
}
