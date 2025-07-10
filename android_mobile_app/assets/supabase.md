# Supabase Integration for SnapNotes Android App

- There is currently NO official JVM or Android library for Supabase on Maven Central.
- Integration is performed by making HTTPS REST API requests to Supabase directly (use Retrofit + OkHttp).
- Keys (`SUPABASE_URL`, `SUPABASE_KEY`) are stored in `res/values/secrets.xml`.
- Use `SupabaseService.getInstance(context)` to obtain a Retrofit client configured for the project's Supabase URL.
- Implement authentication and data operations by defining Retrofit service interfaces for Supabase's REST endpoints.
- For best security, keys may be further obfuscated at build time or provided through a secrets manager for release builds.
