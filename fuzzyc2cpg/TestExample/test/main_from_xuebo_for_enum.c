






#ifdef _WIN32

#endif



#ifdef HAVE_SYS_CPUSET_H

#endif

#ifdef HAVE_PTHREAD_H

#endif

#if defined(HAVE_PTHREAD_SETAFFINITY_NP) && defined(__FreeBSD__)

#endif

#ifndef LOG_H





#ifdef HAVE_PTHREAD_H

#endif

extern pthread_mutex_t print_mtx;

enum log_level {
    LOG_LEVEL_DEBUG = 10,
    LOG_LEVEL_MSG = 20,
    LOG_LEVEL_WARN = 30,
    LOG_LEVEL_ERR = 40,
    LOG_LEVEL_NONE = 100
};

void set_log_level(enum log_level threshold);

void log_debug(const char *fmt, ...);
void log_msg(const char *fmt, ...);
void log_warn(const char *fmt, ...);
void log_err(const char *fmt, ...);

void vplog(const unsigned int level, const char *fmt, va_list args);
void plog(const unsigned int level, const char *fmt, ...);

#endif

#ifndef OPTIONS_H


struct student{
    char no[20];    //学号
    char name[20];  //姓名
    char sex[5];  //性别
    int age;     //年龄
};       
struct student stu1,stu2;



enum case_behavior {
    CASE_DEFAULT, /* Changes to CASE_SMART at the end of option parsing */
    CASE_SENSITIVE,
    CASE_INSENSITIVE,
    CASE_SMART,
    CASE_SENSITIVE_RETRY_INSENSITIVE /* for future use */
};

enum path_print_behavior {
    PATH_PRINT_DEFAULT,           /* PRINT_TOP if > 1 file being searched, else PRINT_NOTHING */
    PATH_PRINT_DEFAULT_EACH_LINE, /* PRINT_EACH_LINE if > 1 file being searched, else PRINT_NOTHING */
    PATH_PRINT_TOP,
    PATH_PRINT_EACH_LINE,
    PATH_PRINT_NOTHING
};

typedef struct {
    int ackmate;
    pcre *ackmate_dir_filter;
    pcre_extra *ackmate_dir_filter_extra;
    size_t after;
    size_t before;
    enum case_behavior casing;
    const char *file_search_string;
    int match_files;
    pcre *file_search_regex;
    pcre_extra *file_search_regex_extra;
    int color;
    char *color_line_number;
    char *color_match;
    char *color_path;
    int color_win_ansi;
    int column;
    int context;
    int follow_symlinks;
    int invert_match;
    int literal;
    int literal_starts_wordchar;
    int literal_ends_wordchar;
    size_t max_matches_per_file;
    int max_search_depth;
    int mmap;
    int multiline;
    int one_dev;
    int only_matching;
    char path_sep;
    int path_to_ignore;
    int print_break;
    int print_count;
    int print_filename_only;
    int print_nonmatching_files;
    int print_path;
    int print_all_paths;
    int print_line_numbers;
    int print_long_lines; /* TODO: support this in print.c */
    int passthrough;
    pcre *re;
    pcre_extra *re_extra;
    int recurse_dirs;
    int search_all_files;
    int skip_vcs_ignores;
    int search_binary_files;
    int search_zip_files;
    int search_hidden_files;
    int search_stream; /* true if tail -F blah | ag */
    int stats;
    size_t stream_line_num; /* This should totally not be in here */
    int match_found;        /* This should totally not be in here */
    ino_t stdout_inode;
    char *query;
    int query_len;
    char *pager;
    int paths_len;
    int parallel;
    int use_thread_affinity;
    int vimgrep;
    size_t width;
    int word_regexp;
    int workers;
} cli_options;

/* global options. parse_options gives it sane values, everything else reads from it */
extern cli_options opts;

typedef struct option option_t;

void usage(void);
void print_version(void);

void init_options(void);
void parse_options(int argc, char **argv, char **base_paths[], char **paths[]);
void cleanup_options(void);

#endif

#ifndef SEARCH_H









#ifdef _WIN32

#else

#endif





#ifdef HAVE_PTHREAD_H

#endif

#ifndef DECOMPRESS_H







typedef enum {
    AG_NO_COMPRESSION,
    AG_GZIP,
    AG_COMPRESS,
    AG_ZIP,
    AG_XZ,
} ag_compression_type;

ag_compression_type is_zipped(const void *buf, const int buf_len);

void *decompress(const ag_compression_type zip_type, const void *buf, const int buf_len, const char *dir_full_path, int *new_buf_len);

#if HAVE_FOPENCOOKIE
FILE *decompress_open(int fd, const char *mode, ag_compression_type ctype);
#endif

#endif

#ifndef IGNORE_H




struct ignores {
    char **extensions; /* File extensions to ignore */
    size_t extensions_len;

    char **names; /* Non-regex ignore lines. Sorted so we can binary search them. */
    size_t names_len;
    char **slash_names; /* Same but starts with a slash */
    size_t slash_names_len;

    char **regexes; /* For patterns that need fnmatch */
    size_t regexes_len;
    char **invert_regexes; /* For "!" patterns */
    size_t invert_regexes_len;
    char **slash_regexes;
    size_t slash_regexes_len;

    const char *dirname;
    size_t dirname_len;
    char *abs_path;
    size_t abs_path_len;

    struct ignores *parent;
};
typedef struct ignores ignores;

extern ignores *root_ignores;

extern const char *evil_hardcoded_ignore_files[];
extern const char *ignore_pattern_files[];

ignores *init_ignore(ignores *parent, const char *dirname, const size_t dirname_len);
void cleanup_ignore(ignores *ig);

void add_ignore_pattern(ignores *ig, const char *pattern);

void load_ignore_patterns(ignores *ig, const char *path);

int filename_filter(const char *path, const struct dirent *dir, void *baton);

int is_empty(ignores *ig);

#endif



#ifndef PRINT_H

#ifndef UTIL_H












extern FILE *out_fd;

#ifndef TRUE
#endif

#ifndef FALSE
#endif


#ifdef __clang__
#else
#endif

void *ag_malloc(size_t size);
void *ag_realloc(void *ptr, size_t size);
void *ag_calloc(size_t nelem, size_t elsize);
char *ag_strdup(const char *s);
char *ag_strndup(const char *s, size_t size);

typedef struct {
    size_t start; /* Byte at which the match starts */
    size_t end;   /* and where it ends */
} match_t;

typedef struct {
    size_t total_bytes;
    size_t total_files;
    size_t total_matches;
    size_t total_file_matches;
    struct timeval time_start;
    struct timeval time_end;
} ag_stats;


extern ag_stats stats;

/* Union to translate between chars and words without violating strict aliasing */
typedef union {
    char as_chars[sizeof(uint16_t)];
    uint16_t as_word;
} word_t;

void free_strings(char **strs, const size_t strs_len);

void generate_alpha_skip(const char *find, size_t f_len, size_t skip_lookup[], const int case_sensitive);
int is_prefix(const char *s, const size_t s_len, const size_t pos, const int case_sensitive);
size_t suffix_len(const char *s, const size_t s_len, const size_t pos, const int case_sensitive);
void generate_find_skip(const char *find, const size_t f_len, size_t **skip_lookup, const int case_sensitive);
void generate_hash(const char *find, const size_t f_len, uint8_t *H, const int case_sensitive);

/* max is already defined on spec-violating compilers such as MinGW */
size_t ag_max(size_t a, size_t b);
size_t ag_min(size_t a, size_t b);

const char *boyer_moore_strnstr(const char *s, const char *find, const size_t s_len, const size_t f_len,
                                const size_t alpha_skip_lookup[], const size_t *find_skip_lookup, const int case_insensitive);
const char *hash_strnstr(const char *s, const char *find, const size_t s_len, const size_t f_len, uint8_t *h_table, const int case_sensitive);

size_t invert_matches(const char *buf, const size_t buf_len, match_t matches[], size_t matches_len);
void realloc_matches(match_t **matches, size_t *matches_size, size_t matches_len);
void compile_study(pcre **re, pcre_extra **re_extra, char *q, const int pcre_opts, const int study_opts);


int is_binary(const void *buf, const size_t buf_len);
int is_regex(const char *query);
int is_fnmatch(const char *filename);
int binary_search(const char *needle, char **haystack, int start, int end);

void init_wordchar_table(void);
int is_wordchar(char ch);

int is_lowercase(const char *s);

int is_directory(const char *path, const struct dirent *d);
int is_symlink(const char *path, const struct dirent *d);
int is_named_pipe(const char *path, const struct dirent *d);

void die(const char *fmt, ...);

void ag_asprintf(char **ret, const char *fmt, ...);

ssize_t buf_getline(const char **line, const char *buf, const size_t buf_len, const size_t buf_offset);

#ifndef HAVE_FGETLN
char *fgetln(FILE *fp, size_t *lenp);
#endif
#ifndef HAVE_GETLINE
ssize_t getline(char **lineptr, size_t *n, FILE *stream);
#endif
#ifndef HAVE_REALPATH
char *realpath(const char *path, char *resolved_path);
#endif
#ifndef HAVE_STRLCPY
size_t strlcpy(char *dest, const char *src, size_t size);
#endif
#ifndef HAVE_VASPRINTF
int vasprintf(char **ret, const char *fmt, va_list args);
#endif

#endif


void print_init_context(void);
void print_cleanup_context(void);
void print_context_append(const char *line, size_t len);
void print_trailing_context(const char *path, const char *buf, size_t n);
void print_path(const char *path, const char sep);
void print_path_count(const char *path, const char sep, const size_t count);
void print_line(const char *buf, size_t buf_pos, size_t prev_line_offset);
void print_binary_file_matches(const char *path);
void print_file_matches(const char *path, const char *buf, const size_t buf_len, const match_t matches[], const size_t matches_len);
void print_line_number(size_t line, const char sep);
void print_column_number(const match_t matches[], size_t last_printed_match,
                         size_t prev_line_offset, const char sep);
void print_file_separator(void);
const char *normalize_path(const char *path);

#ifdef _WIN32
void windows_use_ansi(int use_ansi);
int fprintf_w32(FILE *fp, const char *format, ...);
#endif

#endif

/*
Copyright (c) 2003-2014, Troy D. Hanson     http://troydhanson.github.com/uthash/
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

#ifndef UTHASH_H

 /* ptrdiff_t */
 /* exit() */
 /* memcmp,strlen */

/* These macros use decltype or the earlier __typeof GNU extension.
   As decltype is only available in newer compilers (VS2010 or gcc 4.3+
   when compiling c++ source) this code uses whatever method is needed
   or, for VS2008 where neither is available, uses casting workarounds. */
#if defined(_MSC_VER)                        /* MS compiler */
#if _MSC_VER >= 1600 && defined(__cplusplus) /* VS2010 or newer in C++ mode */
#else /* VS2008 or older (or VS2010 in C mode) */
#endif
#elif defined(__BORLANDC__) || defined(__LCC__) || defined(__WATCOMC__)
#else /* GNU, Sun and other compilers */
#endif

#ifdef NO_DECLTYPE
#else
#endif

/* a number of the hash function use uint32_t which isn't defined on Pre VS2010 */
#if defined(_WIN32)
#if defined(_MSC_VER) && _MSC_VER >= 1600

#elif defined(__WATCOMC__)

#else
typedef unsigned int uint32_t;
typedef unsigned char uint8_t;
#endif
#else

#endif


#ifndef uthash_fatal
#endif
#ifndef uthash_malloc
#endif
#ifndef uthash_free
#endif

#ifndef uthash_noexpand_fyi
#endif
#ifndef uthash_expand_fyi
#endif

/* initial number of buckets */

/* calculate the element whose hash handle address is hhe */


#ifdef HASH_BLOOM





#else
#endif






/* delete "delptr" from the hash table.
 * "the usual" patch-up process for the app-order doubly-linked-list.
 * The use of _hd_hh_del below deserves special explanation.
 * These used to be expressed using (delptr) but that led to a bug
 * if someone used the same symbol for the head and deletee, like
 *  HASH_DELETE(hh,users,users);
 * We want that to work, but by changing the head (users) below
 * we were forfeiting our ability to further refer to the deletee (users)
 * in the patch-up process. Solution: use scratch space to
 * copy the deletee pointer, then the latter references are via that
 * scratch pointer rather than through the repointed (users) symbol.
 */


/* convenience forms of HASH_FIND/HASH_ADD/HASH_DEL */

/* HASH_FSCK checks hash integrity on every add/delete when HASH_DEBUG is defined.
 * This is for uthash developer only; it compiles away if HASH_DEBUG isn't defined.
 */
#ifdef HASH_DEBUG
#else
#endif

/* When compiled with -DHASH_EMIT_KEYS, length-prefixed keys are emitted to
 * the descriptor to which this macro is defined for tuning the hash function.
 * The app can #include <unistd.h> to get the prototype for write(2). */
#ifdef HASH_EMIT_KEYS
#else
#endif

/* default to Jenkin's hash unless overridden e.g. DHASH_FUNCTION=HASH_SAX */
#ifdef HASH_FUNCTION
#else
#endif

/* The Bernstein hash function, used in Perl prior to v5.6. Note (x<<5+x)=x*33. */


/* SAX/FNV/OAT/JEN hash functions are macro variants of those listed at
 * http://eternallyconfuzzled.com/tuts/algorithms/jsw_tut_hashing.aspx */
/* FNV-1a variation */




/* The Paul Hsieh hash function */
#undef get16bits
#if (defined(__GNUC__) && defined(__i386__)) || defined(__WATCOMC__) || defined(_MSC_VER) || defined(__BORLANDC__) || defined(__TURBOC__)
#endif

#if !defined(get16bits)
#endif

#ifdef HASH_USING_NO_STRICT_ALIASING
/* The MurmurHash exploits some CPU's (x86,x86_64) tolerance for unaligned reads.
 * For other types of CPU's (e.g. Sparc) an unaligned read causes a bus error.
 * MurmurHash uses the faster approach only on CPU's where we know it's safe.
 *
 * Note the preprocessor built-in defines can be emitted using:
 *
 *   gcc -m64 -dM -E - < /dev/null                  (on gcc)
 *   cc -## a.c (where a.c is a simple test file)   (Sun Studio)
 */
#if (defined(__i386__) || defined(__x86_64__) || defined(_M_IX86))
#else /* non intel */
#if (defined(__BIG_ENDIAN__) || defined(SPARC) || defined(__ppc__) || defined(__ppc64__))
#else /* assume little endian non-intel */
#endif
#endif

#endif /* HASH_USING_NO_STRICT_ALIASING */

/* key comparison function; return 0 if keys equal */

/* iterate over items in a known bucket to find desired item */

/* add an item to a bucket  */

/* remove an item from a given bucket */

/* Bucket expansion has the effect of doubling the number of buckets
 * and redistributing the items into the new buckets. Ideally the
 * items will distribute more or less evenly into the new buckets
 * (the extent to which this is true is a measure of the quality of
 * the hash function as it applies to the key domain).
 *
 * With the items distributed into more buckets, the chain length
 * (item count) in each bucket is reduced. Thus by expanding buckets
 * the hash keeps a bound on the chain length. This bounded chain
 * length is the essence of how a hash provides constant time lookup.
 *
 * The calculation of tbl->ideal_chain_maxlen below deserves some
 * explanation. First, keep in mind that we're calculating the ideal
 * maximum chain length based on the *new* (doubled) bucket count.
 * In fractions this is just n/b (n=number of items,b=new num buckets).
 * Since the ideal chain length is an integer, we want to calculate
 * ceil(n/b). We don't depend on floating point arithmetic in this
 * hash, so to calculate ceil(n/b) with integers we could write
 *
 *      ceil(n/b) = (n/b) + ((n%b)?1:0)
 *
 * and in fact a previous version of this hash did just that.
 * But now we have improved things a bit by recognizing that b is
 * always a power of two. We keep its base 2 log handy (call it lb),
 * so now we can write this with a bit shift and logical AND:
 *
 *      ceil(n/b) = (n>>lb) + ( (n & (b-1)) ? 1:0)
 *
 */


/* This is an adaptation of Simon Tatham's O(n log(n)) mergesort */
/* Note that HASH_SORT assumes the hash handle name to be hh.
 * HASH_SRT was added to allow the hash handle name to be passed in. */

/* This function selects items from one hash into another hash.
 * The end result is that the selected items have dual presence
 * in both hashes. There is no copy of the items made; rather
 * they are added into the new hash through a secondary hash
 * hash handle that must be present in the structure. */



#ifdef NO_DECLTYPE
#else
#endif

/* obtain a count of items in the hash */

typedef struct UT_hash_bucket {
    struct UT_hash_handle *hh_head;
    unsigned count;

    /* expand_mult is normally set to 0. In this situation, the max chain length
    * threshold is enforced at its default value, HASH_BKT_CAPACITY_THRESH. (If
    * the bucket's chain exceeds this length, bucket expansion is triggered).
    * However, setting expand_mult to a non-zero value delays bucket expansion
    * (that would be triggered by additions to this particular bucket)
    * until its chain length reaches a *multiple* of HASH_BKT_CAPACITY_THRESH.
    * (The multiplier is simply expand_mult+1). The whole idea of this
    * multiplier is to reduce bucket expansions, since they are expensive, in
    * situations where we know that a particular bucket tends to be overused.
    * It is better to let its chain length grow to a longer yet-still-bounded
    * value, than to do an O(n) bucket expansion too often.
    */
    unsigned expand_mult;

} UT_hash_bucket;

/* random signature used only to find hash tables in external analysis */

typedef struct UT_hash_table {
    UT_hash_bucket *buckets;
    unsigned num_buckets, log2_num_buckets;
    unsigned num_items;
    struct UT_hash_handle *tail; /* tail hh in app order, for fast append    */
    ptrdiff_t hho;               /* hash handle offset (byte pos of hash handle in element */

    /* in an ideal situation (all buckets used equally), no bucket would have
    * more than ceil(#items/#buckets) items. that's the ideal chain length. */
    unsigned ideal_chain_maxlen;

    /* nonideal_items is the number of items in the hash whose chain position
    * exceeds the ideal chain maxlen. these items pay the penalty for an uneven
    * hash distribution; reaching them in a chain traversal takes >ideal steps */
    unsigned nonideal_items;

    /* ineffective expands occur when a bucket doubling was performed, but
    * afterward, more than half the items in the hash had nonideal chain
    * positions. If this happens on two consecutive expansions we inhibit any
    * further expansion, as it's not helping; this happens when the hash
    * function isn't a good fit for the key domain. When expansion is inhibited
    * the hash will still work, albeit no longer in constant time. */
    unsigned ineff_expands, noexpand;

    uint32_t signature; /* used only to find hash tables in external analysis */
#ifdef HASH_BLOOM
    uint32_t bloom_sig; /* used only to test bloom exists in external analysis */
    uint8_t *bloom_bv;
    char bloom_nbits;
#endif

} UT_hash_table;

typedef struct UT_hash_handle {
    struct UT_hash_table *tbl;
    void *prev;                     /* prev element in app order      */
    void *next;                     /* next element in app order      */
    struct UT_hash_handle *hh_prev; /* previous hh in bucket order    */
    struct UT_hash_handle *hh_next; /* next hh in bucket order        */
    void *key;                      /* ptr to enclosing struct's key  */
    unsigned keylen;                /* enclosing struct's key len     */
    unsigned hashv;                 /* result of hash-fcn(key)        */
} UT_hash_handle;

#endif /* UTHASH_H */



extern size_t alpha_skip_lookup[256];
extern size_t *find_skip_lookup;
extern uint8_t h_table[(64 * 1024)] __attribute__((aligned(64)));

struct work_queue_t {
    char *path;
    struct work_queue_t *next;
};
typedef struct work_queue_t work_queue_t;

extern work_queue_t *work_queue;
extern work_queue_t *work_queue_tail;
extern int done_adding_files;
extern pthread_cond_t files_ready;
extern pthread_mutex_t stats_mtx;
extern pthread_mutex_t work_queue_mtx;


/* For symlink loop detection */

typedef struct {
    dev_t dev;
    ino_t ino;
} dirkey_t;

typedef struct {
    dirkey_t key;
    UT_hash_handle hh;
} symdir_t;

extern symdir_t *symhash;

ssize_t search_buf(const char *buf, const size_t buf_len,
                   const char *dir_full_path);
ssize_t search_stream(FILE *stream, const char *path);
void search_file(const char *file_full_path);

void *search_file_worker(void *i);

void search_dir(ignores *ig, const char *base_path, const char *path, const int depth, dev_t original_dev);

#endif



typedef struct {
    pthread_t thread;
    int id;
} worker_t;

int main(int argc, char **argv) {
    char **base_paths = NULL;
    char **paths = NULL;
    int i;
    int pcre_opts = PCRE_MULTILINE;
    int study_opts = 0;
    worker_t *workers = NULL;
    int workers_len;
    int num_cores;

#ifdef HAVE_PLEDGE
    if (pledge("stdio rpath proc exec", NULL) == -1) {
        die("pledge: %s", strerror(errno));
    }
#endif

    set_log_level(LOG_LEVEL_WARN);

    work_queue = NULL;
    work_queue_tail = NULL;
    root_ignores = init_ignore(NULL, "", 0);
    out_fd = stdout;

    parse_options(argc, argv, &base_paths, &paths);
    log_debug("PCRE Version: %s", pcre_version());
    if (opts.stats) {
        memset(&stats, 0, sizeof(stats));
        gettimeofday(&(stats.time_start), NULL);
    }

#ifdef USE_PCRE_JIT
    int has_jit = 0;
    pcre_config(PCRE_CONFIG_JIT, &has_jit);
    if (has_jit) {
        study_opts |= PCRE_STUDY_JIT_COMPILE;
    }
#endif

#ifdef _WIN32
    {
        SYSTEM_INFO si;
        GetSystemInfo(&si);
        num_cores = si.dwNumberOfProcessors;
    }
#else
    num_cores = (int)sysconf(_SC_NPROCESSORS_ONLN);
#endif

    workers_len = num_cores < 8 ? num_cores : 8;
    if (opts.literal) {
        workers_len--;
    }
    if (opts.workers) {
        workers_len = opts.workers;
    }
    if (workers_len < 1) {
        workers_len = 1;
    }

    log_debug("Using %i workers", workers_len);
    done_adding_files = 0;
    workers = ag_calloc(workers_len, sizeof(worker_t));
    if (pthread_cond_init(&files_ready, NULL)) {
        die("pthread_cond_init failed!");
    }
    if (pthread_mutex_init(&print_mtx, NULL)) {
        die("pthread_mutex_init failed!");
    }
    if (opts.stats && pthread_mutex_init(&stats_mtx, NULL)) {
        die("pthread_mutex_init failed!");
    }
    if (pthread_mutex_init(&work_queue_mtx, NULL)) {
        die("pthread_mutex_init failed!");
    }

    if (opts.casing == CASE_SMART) {
        opts.casing = is_lowercase(opts.query) ? CASE_INSENSITIVE : CASE_SENSITIVE;
    }

    if (opts.literal) {
        if (opts.casing == CASE_INSENSITIVE) {
            /* Search routine needs the query to be lowercase */
            char *c = opts.query;
            for (; *c != '\0'; ++c) {
                *c = (char)tolower(*c);
            }
        }
        generate_alpha_skip(opts.query, opts.query_len, alpha_skip_lookup, opts.casing == CASE_SENSITIVE);
        find_skip_lookup = NULL;
        generate_find_skip(opts.query, opts.query_len, &find_skip_lookup, opts.casing == CASE_SENSITIVE);
        generate_hash(opts.query, opts.query_len, h_table, opts.casing == CASE_SENSITIVE);
        if (opts.word_regexp) {
            init_wordchar_table();
            opts.literal_starts_wordchar = is_wordchar(opts.query[0]);
            opts.literal_ends_wordchar = is_wordchar(opts.query[opts.query_len - 1]);
        }
    } else {
        if (opts.casing == CASE_INSENSITIVE) {
            pcre_opts |= PCRE_CASELESS;
        }
        if (opts.word_regexp) {
            char *word_regexp_query;
            ag_asprintf(&word_regexp_query, "\\b(?:%s)\\b", opts.query);
            free(opts.query);
            opts.query = word_regexp_query;
            opts.query_len = strlen(opts.query);
        }
        compile_study(&opts.re, &opts.re_extra, opts.query, pcre_opts, study_opts);
    }

    if (opts.search_stream) {
        search_stream(stdin, "");
    } else {
        for (i = 0; i < workers_len; i++) {
            workers[i].id = i;
            int rv = pthread_create(&(workers[i].thread), NULL, &search_file_worker, &(workers[i].id));
            if (rv != 0) {
                die("Error in pthread_create(): %s", strerror(rv));
            }
#if defined(HAVE_PTHREAD_SETAFFINITY_NP) && (defined(USE_CPU_SET) || defined(HAVE_SYS_CPUSET_H))
            if (opts.use_thread_affinity) {
#if defined(__linux__) || defined(__midipix__)
                cpu_set_t cpu_set;
#elif __FreeBSD__
                cpuset_t cpu_set;
#endif
                CPU_ZERO(&cpu_set);
                CPU_SET(i % num_cores, &cpu_set);
                rv = pthread_setaffinity_np(workers[i].thread, sizeof(cpu_set), &cpu_set);
                if (rv) {
                    log_err("Error in pthread_setaffinity_np(): %s", strerror(rv));
                    log_err("Performance may be affected. Use --noaffinity to suppress this message.");
                } else {
                    log_debug("Thread %i set to CPU %i", i, i);
                }
            } else {
                log_debug("Thread affinity disabled.");
            }
#else
            log_debug("No CPU affinity support.");
#endif
        }

#ifdef HAVE_PLEDGE
        if (pledge("stdio rpath", NULL) == -1) {
            die("pledge: %s", strerror(errno));
        }
#endif
        for (i = 0; paths[i] != NULL; i++) {
            log_debug("searching path %s for %s", paths[i], opts.query);
            symhash = NULL;
            ignores *ig = init_ignore(root_ignores, "", 0);
            struct stat s = { .st_dev = 0 };
#ifndef _WIN32
            /* The device is ignored if opts.one_dev is false, so it's fine
             * to leave it at the default 0
             */
            if (opts.one_dev && lstat(paths[i], &s) == -1) {
                log_err("Failed to get device information for path %s. Skipping...", paths[i]);
            }
#endif
            search_dir(ig, base_paths[i], paths[i], 0, s.st_dev);
            cleanup_ignore(ig);
        }
        pthread_mutex_lock(&work_queue_mtx);
        done_adding_files = TRUE;
        pthread_cond_broadcast(&files_ready);
        pthread_mutex_unlock(&work_queue_mtx);
        for (i = 0; i < workers_len; i++) {
            if (pthread_join(workers[i].thread, NULL)) {
                die("pthread_join failed!");
            }
        }
    }

    if (opts.stats) {
        gettimeofday(&(stats.time_end), NULL);
        double time_diff = ((long)stats.time_end.tv_sec * 1000000 + stats.time_end.tv_usec) -
                           ((long)stats.time_start.tv_sec * 1000000 + stats.time_start.tv_usec);
        time_diff /= 1000000;
        printf("%zu matches\n%zu files contained matches\n%zu files searched\n%zu bytes searched\n%f seconds\n",
               stats.total_matches, stats.total_file_matches, stats.total_files, stats.total_bytes, time_diff);
        pthread_mutex_destroy(&stats_mtx);
    }

    if (opts.pager) {
        pclose(out_fd);
    }
    cleanup_options();
    pthread_cond_destroy(&files_ready);
    pthread_mutex_destroy(&work_queue_mtx);
    pthread_mutex_destroy(&print_mtx);
    cleanup_ignore(root_ignores);
    free(workers);
    for (i = 0; paths[i] != NULL; i++) {
        free(paths[i]);
        free(base_paths[i]);
    }
    free(base_paths);
    free(paths);
    if (find_skip_lookup) {
        free(find_skip_lookup);
    }
    return !opts.match_found;
}
